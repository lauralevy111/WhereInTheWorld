package com.example.whereintheworld;

import java.util.ArrayList;

public class Group {

    private BusinessUser businessUser;

    private ArrayList<User> members;

    public Group() {

    }

    public void setBusinessUser(BusinessUser businessUser) {
        this.businessUser = businessUser;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }

    public void addMember(User newMember) {
        members.add(newMember);
    }
}
