package com.epam.rd.contactbook;

public class Contact {
    private String contactName;
    private final ContactInfo name;
    private ContactInfo phoneNumber;
    private boolean phoneNumberAdded;
    private final Email[] emails = new Email[3];
    private int emailCounter;
    private final Social[] socials = new Social[5];
    private int socialCounter;
    private int totalCounter;

    public Contact(String contactName) {
        NameContactInfo name = new NameContactInfo();
        this.contactName = contactName;
        this.name = name;

        totalCounter++;
    }

    private class NameContactInfo implements ContactInfo {
        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return contactName;
        }
    }

    public static class Email implements ContactInfo {
        public String localPart;
        public String domain;

        public Email() {
        }

        public Email(String localPart, String domain) {
            this.localPart = localPart;
            this.domain = domain;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return localPart + "@" + domain;
        }
    }

    public static class Social implements ContactInfo {
        private String title;
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return id;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public void rename(String newName) {
        if (newName != null && !newName.isBlank())
        this.contactName = newName;
    }

    private Email coreAddEmail (Email email) {
        if (emailCounter >= 3) {
            return null;
        }

        emails[emailCounter++] = email;
        totalCounter++;
        return email;
    }

    public Email addEmail(String localPart, String domain) {
        return coreAddEmail(new Email(localPart, domain));
    }

    public Email addEpamEmail(String firstname, String lastname) {
        return coreAddEmail(new Email() {
            @Override
            public String getTitle() {
                return "Epam Email";
            }

            @Override
            public String getValue() {
                return firstname + "_" + lastname + "@" + "epam.com";
            }
        });
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        if(phoneNumberAdded) {
            return null;
        }
        ContactInfo phoneNumber = new ContactInfo() {
            @Override
            public String getTitle() {
                return "Tel";
            }

            @Override
            public String getValue() {
                return "+" + code + " " + number;
            }
        };

        this.phoneNumber = phoneNumber;
        totalCounter++;
        phoneNumberAdded = true;

        return phoneNumber;
    }

    private Social addSocial(String title, String id) {
        if (socialCounter >= 5) {
            return null;
        }

        Social social = new Social();
        social.setTitle(title);
        social.setId(id);

        socials[socialCounter++] = social;
        totalCounter++;

        return social;
    }

    public Social addTwitter(String twitterId) {
        return addSocial("Twitter", twitterId);
    }

    public Social addInstagram(String instagramId) {
        return addSocial("Instagram", instagramId);
    }

    public Social addSocialMedia(String title, String id) {
        return addSocial(title, id);
    }

    public ContactInfo[] getInfo() {
        ContactInfo[] contactInfos = new ContactInfo[totalCounter];
        int bufCounter = 0;

        contactInfos[bufCounter++] = name;

        if (phoneNumber != null) {
            contactInfos[bufCounter++] = phoneNumber;
        }

        for (int i = 0; i < emailCounter; i++) {
            contactInfos[bufCounter++] = emails[i];
        }

        for (int i = 0; i < socialCounter; i++) {
            contactInfos[bufCounter++] = socials[i];
        }

        return contactInfos;
    }
}