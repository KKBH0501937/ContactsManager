
public class ContactsManager {

    /** Tableau stockant tous les contacts enregistrés. */
    Contact[] myFriends;

    /** Nombre actuel de contacts enregistrés dans la liste. */
    int friendsCount;

    /**
     * Construit un nouveau gestionnaire de contact vide.
     * Initialise le compteur de contacts à 0 alloue
     * un tableau pouvant accueillir jusqu'à 500 contacts.
     */
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    /**
     * Ajoute un contact à la fin de la liste des contacts.
     *
     * @param contact le contact à ajouter
     */
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    /**
     * Recherche un contact par son nom exact dans la liste.
     *
     * La recherche est sensible à la casse et parcourt
     * séquentiellement tous les contacts enregistrés
     *
     * @param searchName le nom exact du contact à rechercher
     * @return le contact correspondant au nom donné,
     *         ou null si aucun contact n'est trouvé
     */
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}