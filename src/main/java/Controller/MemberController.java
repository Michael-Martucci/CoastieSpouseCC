package Controller;

import Model.Member;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//use request mapping here to avoid need to add to individual mappings. All endpoints will begin with this mapping
@RequestMapping("/members")
public class MemberController {

    //use this to be able to increment member iDs with each new added
    private Long nextId = 1L;
    //store our member objects in an Array list
    private List <Member> members = new ArrayList<>();

    //return all members
    @GetMapping
    public List <Member> getAllMembers(){
        return members;
    }
    //create new member.@RequestBody to pass JSON in with curl command with data matching POJO Member.java
    @PostMapping
    public Member createMember(@RequestBody @NonNull Member createMember){ //use @NonNull to ensure a member must be supplied
        //increment member id each time one is added
        createMember.setId(nextId++);
        members.add(createMember);
        return createMember;
    }



    //edit existing member
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody Member updateMember){
        //Loop through all member ids to return the id passed in the request parameter
        //member.size() used to determine list elements
       for (int i = 0 ; i < members.size() ; i++)
       {
           //return the via id set as i
           Member member = members.get(i);
           //confirm we have the correct member requested
           if (member.getId().equals(id))
           {
               //update each field with what is passed in the request (JSON)
               member.setName(updateMember.getName());
               member.setSpouse(updateMember.getSpouse());
               member.setPhoneNumber(updateMember.getPhoneNumber());
               member.setAddress(updateMember.getAddress());
               member.setIsAdmin(updateMember.getIsAdmin());
               //return the members updated data
               return member;
           }
       }
       //no existing member found for id in request.
        //update this to include HTTP status code and description
       return null;
    }

    @DeleteMapping("/{id}")
    public Member deleteMember(@PathVariable Long id) {
        for (int i = 0; i < members.size(); i++) {
            //return the id as i
            Member member = members.get(i);
            if (member.getId().equals(id)) {

                // use .remove() to delete from a List
                members.remove(i);
                return member;
            }
        }
        //no existing member
        return null;
    }
}
