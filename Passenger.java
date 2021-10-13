package com.company;

public class Passenger {



         private static int idCounter;
        private final int id;

        private static class Address {
            String street, city, state;

//---------------------------CONSTRUCTOR-------------------------------------//

            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }
        }
        private final Address address;

        private static class Contact {
            String name, phoneNumber, email;

//---------------------------CONSTRUCTOR-------------------------------------//

            public Contact(String name, String phone, String email) {
                this.name = name;
                this.phoneNumber = phone;
                this.email = email;
            }
        }
        private final Contact contact;

        static {
            idCounter = 0;
        }
//---------------------------CONSTRUCTOR-------------------------------------//

        public Passenger (String addressStreet, String addressCity,
                               String addressState, String contactName, String contactPhone,
                               String contactEmail) {
            this.id = ++idCounter;
            this.address = new Address(addressStreet, addressCity, addressState);
            this.contact = new Contact(contactName, contactPhone, contactEmail);
        }

        //-----------------------------GETTERS AND SETTERS-----------------------------//

        public int getId() {
            return this.id;
        }
        public String getAddressDetails() {
            return address.street + ", " + address.city + ", " + address.state;
        }

        public String getContactDetails() {
            return contact.name + ", " + contact.phoneNumber + ", " + contact.email;
        }
    }
