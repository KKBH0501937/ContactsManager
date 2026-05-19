Contacts Manager

Un projet Java d'exercice illustrant la gestion d'une liste de contacts


Structure du projet

Contact.java          Modèle de données d'un contact
ContactsManager.java  Gestionnaire de la liste de contacts
Main.java             Point d'entrée du programme


Description des classes

Contact
Représente un contact avec deux attributs : le nom complet (name) et le numéro de téléphone (phoneNumber).

ContactsManager
Gestionnaire de contacts permettant de stocker et de rechercher des contacts dans un tableau de 500 entrées maximum. Expose trois membres : le tableau myFriends, le compteur friendsCount, la méthode addContact() pour ajouter un contact, et la méthode searchContact() pour rechercher un contact par son nom exact. La recherche est sensible à la casse et retourne null si aucun contact n'est trouvé.

Main
Point d'entrée du programme. Crée cinq contacts, les ajoute à la liste, puis recherche le contact "Yao Pascal" et affiche son numéro de téléphone.



Compilation et exécution


Résultat attendu : +2250508762345


