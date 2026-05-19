public class Main {

    public static void main(String[] args){
        ContactsManager myContactsManager = new ContactsManager();




        //Adding cinq contacts dans ma liste
        Contact oneContact = new Contact();
        oneContact.name = "N'guessan Armand";
        oneContact.phoneNumber = "+2250508095645";

        myContactsManager.addContact(oneContact);


        Contact twoContact = new Contact();
        twoContact.name = "Konan Stéphane";
        twoContact.phoneNumber = "+2250508095644";

        myContactsManager.addContact(twoContact);

        Contact threeContact = new Contact();
        threeContact.name = "Kouamé Noël";
        threeContact.phoneNumber = "+2250508095646";

        myContactsManager.addContact(threeContact);


        Contact fourContact = new Contact();
        fourContact.name = "Soro Richard";
        fourContact.phoneNumber = "+2250508095650";

        myContactsManager.addContact(fourContact);


        Contact fiveContact = new Contact();
        fiveContact.name = "Yao Pascal";
        fiveContact.phoneNumber = "+2250508762345";

        myContactsManager.addContact(fiveContact);





        //Recherche de "Yao Pascal" dans ma liste de contacts et afficher son numéro de téléphone

        Contact foundContact = myContactsManager.searchContact("Yao Pascal");

        System.out.println(foundContact.phoneNumber);


    }
}
