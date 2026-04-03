package model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.ArrayList;
import java.util.List;

public class ContactApp {

    public static void main(String[] args) throws JsonProcessingException {
        List<Contact> contactList = new ArrayList<>();


        List<EmailContact> emailContacts = new ArrayList<>();
        emailContacts.add(new EmailContact(1, "professional", "yyy@gmail.com"));
        emailContacts.add(new EmailContact(2, "professional", "zzzz@gmail.com"));
        List<PhoneContact> phoneContacts = new ArrayList<>();
        phoneContacts.add(new PhoneContact(1, "home", "6412339813"));
        phoneContacts.add(new PhoneContact(2, "mobile", "6412339813"));
        contactList.add(new Contact(1, "Thiery", "Handerson", "Amazon",
                "Software Developer", emailContacts, phoneContacts));



        contactList.add(new Contact(2, "Binette", "Simson", "Medicaid",
                "Nurse", null, null));

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonContactList = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(contactList);
        System.out.println(jsonContactList);

    }
}
