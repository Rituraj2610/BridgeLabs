package org.rituraj.linked_list.social_media_friend_connections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SocialMedia {
    UserNode head;

    SocialMedia(){
        head = null;
    }

    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        // Create sample users
        User u1 = new User(1, "James", 20, null);
        User u2 = new User(2, "Sophia", 25, null);
        User u3 = new User(3, "Oliver", 30, null);
        User u4 = new User(4, "Emma", 22, null);
        User u5 = new User(5, "Liam", 28, null);
        User u6 = new User(6, "Ava", 27, null);

        // Add users to the social media platform
        socialMedia.addUser(u1);
        socialMedia.addUser(u2);
        socialMedia.addUser(u3);
        socialMedia.addUser(u4);
        socialMedia.addUser(u5);
        socialMedia.addUser(u6);

        // Find specific user nodes
        UserNode james = socialMedia.searchUser("James", 1);
        UserNode sophia = socialMedia.searchUser("Sophia", 2);
        UserNode oliver = socialMedia.searchUser("Oliver", 3);
        UserNode emma = socialMedia.searchUser("Emma", 4);

        // Add friends
        socialMedia.addFriend(james, sophia.data); // James and Sophia become friends
        socialMedia.addFriend(james, oliver.data); // James and Oliver become friends
        socialMedia.addFriend(sophia, emma.data); // Sophia and Emma become friends
        socialMedia.addFriend(oliver, emma.data); // Oliver and Emma become friends
        socialMedia.addFriend(james, emma.data);  // James and Emma become friends

        // Display friend lists
        System.out.println("\nFriend lists:");
        socialMedia.countFriends(james);
        socialMedia.countFriends(sophia);
        socialMedia.countFriends(oliver);
        socialMedia.countFriends(emma);

        socialMedia.findMutualFriends(james, emma); // Find mutual friends between James and Emma

        // Remove a friend
        System.out.println("\nRemoving James and Emma as friends:");
        socialMedia.removeFriend(james, emma.data);

        // Display friend lists after removal
        System.out.println("\nUpdated friend lists:");
        socialMedia.countFriends(james);
        socialMedia.countFriends(emma);

        // Find mutual friends again after removal
        socialMedia.findMutualFriends(james, emma);
    }


    public void addUser(User u){
        if(head == null){
            head = new UserNode(u);
            return;
        }

        UserNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = new UserNode(u);
    }

    public void addFriend(UserNode sender, User accepter) {
        if (sender == null || accepter == null) {
            System.out.println("Invalid users.");
            return;
        }

        // Check if sender already has friends
        if (sender.data.getFriends() != null) {
            IdNode i = sender.data.getFriends();
            while (i != null) {
                if (i.getData() == accepter.getId()) {
                    System.out.println("User already a friend");
                    return;
                }
                if (i.getNext() == null) break;
                i = i.getNext();
            }
            i.setNext(new IdNode(accepter.getId()));  // Add accepter to sender's friends list
        } else {
            sender.data.setFriends(new IdNode(accepter.getId()));
        }

        // Find accepter in the linked list
        UserNode curr = head;
        while (curr != null && !curr.data.equals(accepter)) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Accepter not found in the user list.");
            return;
        }

        // Add sender to accepter's friends list
        if (curr.data.getFriends() != null) {
            IdNode j = curr.data.getFriends();
            while (j.getNext() != null) {
                j = j.getNext();
            }
            j.setNext(new IdNode(sender.data.getId()));
        } else {
            curr.data.setFriends(new IdNode(sender.data.getId()));
        }
    }


    public void removeFriend(UserNode sender, User accepter) {
        if (sender == null || accepter == null) {
            System.out.println("Invalid user.");
            return;
        }

        // Remove accepter from sender's friend list
        if (sender.data.getFriends() == null) {
            System.out.println("Friend list is empty.");
            return;
        }

        IdNode prev = null;
        IdNode current = sender.data.getFriends();

        while (current != null) {
            if (current.getData() == accepter.getId()) {
                // Found the accepter in sender's friend list, now remove it
                if (prev == null) {
                    sender.data.setFriends(current.getNext()); // Remove first node
                } else {
                    prev.setNext(current.getNext());
                }
                break;
            }
            prev = current;
            current = current.getNext();
        }

        // Find the accepter's UserNode
        UserNode curr = head;
        while (curr != null && curr.data.getId() != accepter.getId()) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Accepter not found.");
            return;
        }

        // Remove sender from accepter's friend list
        prev = null;
        current = curr.data.getFriends();

        while (current != null) {
            if (current.getData() == sender.data.getId()) {
                // Found sender in accepter's friend list, now remove it
                if (prev == null) {
                    curr.data.setFriends(current.getNext()); // Remove first node
                } else {
                    prev.setNext(current.getNext());
                }
                break;
            }
            prev = current;
            current = current.getNext();
        }

        System.out.println("Friend removed successfully.");
    }

    public void findMutualFriends(UserNode user1, UserNode user2) {
        if (user1 == null || user2 == null) {
            System.out.println("Invalid user.");
            return;
        }

        IdNode friends1 = user1.data.getFriends();
        IdNode friends2 = user2.data.getFriends();

        if (friends1 == null || friends2 == null) {
            System.out.println("No mutual friends.");
            return;
        }

        Set<Integer> friendSet = new HashSet<>();
        while (friends1 != null) {
            friendSet.add(friends1.getData());
            friends1 = friends1.getNext();
        }

        List<Integer> mutualFriends = new ArrayList<>();
        while (friends2 != null) {
            if (friendSet.contains(friends2.getData())) {
                mutualFriends.add(friends2.getData());
            }
            friends2 = friends2.getNext();
        }

        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            System.out.println("Mutual Friends: " + mutualFriends);
        }
    }

    public UserNode searchUser(String name, int id) {
        UserNode current = head;

        while (current != null) {
            if (current.data.getId() == id || current.data.getName().equalsIgnoreCase(name)) {
                System.out.println("User found: " + current.data.getName() + " (ID: " + current.data.getId() + ")");
                return current;
            }
            current = current.next;
        }

        System.out.println("User not found.");
        return null;
    }

    public void countFriends(UserNode user) {
        if (user == null) {
            System.out.println("Invalid user.");
            return;
        }

        int count = 0;
        IdNode friends = user.data.getFriends();

        while (friends != null) {
            count++;
            friends = friends.getNext();
        }

        System.out.println(user.data.getName() + " has " + count + " friend(s).");
    }

}
