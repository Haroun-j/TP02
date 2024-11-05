
# Projet TP02 - Servlets Java EE 🌐


_Exploration des concepts fondamentaux des servlets Java EE : gestion des requêtes HTTP, génération de contenu dynamique, authentification, et redirection._

---

## Table des Matières
- [Introduction](#introduction)
- [Exercice 1 : TimeServlet - Heure Dynamique](#exercice-1-timeservlet)
- [Exercice 2 : RedirectServlet - Redirection de Pages](#exercice-2-redirectservlet)
- [Exercice 3 : LoginServlet - Authentification](#exercice-3-loginservlet)
- [Structure du Projet](#structure-du-projet)
- [Instructions d'Exécution](#instructions-dexécution)

---

## Introduction

Le projet TP02 se concentre sur les servlets Java EE, permettant de manipuler des requêtes et des réponses HTTP. Chaque exercice explore une fonctionnalité clé, démontrant l'importance de la gestion dynamique des données côté serveur.

---

## Exercice 1 : TimeServlet - Heure Dynamique

### Objectif
Créer `TimeServlet` pour afficher un message de bienvenue et l'heure actuelle. Mettre à jour l'heure en temps réel avec JavaScript.

### Étapes Réalisées
1. **Création du Servlet** : 

    Implémentation de `doGet` pour générer du HTML.

2. **Affichage de l'Heure** :

    Utilisation de `SimpleDateFormat` pour formater l'heure.
3. **Mise à Jour en Temps Réel** :

    JavaScript pour actualiser l'heure sans rafraîchir la page.

### Points Techniques
- Génération dynamique de HTML.
- Script pour l'heure en temps réel.

![Time Servlet](https://i.postimg.cc/bJtKH0N5/1.png)

---

## Exercice 2 : RedirectServlet - Redirection de Pages

### Objectif
Implémenter `RedirectServlet` pour rediriger vers des URLs basées sur les paramètres de la requête.

### Étapes Réalisées
   1. **Paramètres `action` et `page`** :
          
   -  Lire et traiter les paramètres de la requête.

   2. **Redirection** :

   -  Utiliser `sendRedirect` pour rediriger vers l'URL spécifiée.

   3. **Gestion des Erreurs** :
   - Afficher un message si les paramètres sont invalides.

### Exemple d'Utilisation
- **Redirection Google** :
`http://localhost:8080/TP02/RedirectServlet?action=GoogleSearch&page=Java+Servlet`

---

## Exercice 3 : LoginServlet - Authentification

### Objectif
Créer `LoginServlet` pour authentifier les utilisateurs. Si les identifiants sont corrects, l'utilisateur peut rediriger vers d'autres pages.

### Étapes Réalisées
1. **Formulaire de Connexion** :
 - `login.html` avec champs pour l'utilisateur et le mot de passe.
2. **Vérification** :
 - Identifiants corrects : `username: J2EE`, `password: J2EE`.
3. **Formulaire de Redirection** :
 - Proposer des options pour rediriger via `RedirectServlet`.

### Points Techniques
- Vérification des identifiants.
- Formulaire de redirection intégré.

![Logo_](https://i.postimg.cc/MZRYxPF4/2.png)


![Logo__](https://i.postimg.cc/qRcgD31m/3.png)


![4.png](https://i.postimg.cc/Z5q7TP3d/4.png)


![5.png](https://i.postimg.cc/6psqKcFH/5.png)


![6.png](https://i.postimg.cc/2jbBf1VS/6.png)


![7.png](https://i.postimg.cc/T2Dh4B4y/7.png)
---

## Structure du Projet

TP02/

├── WEB-INF/

│   ├── web.xml               # Configuration des servlets

├── src/

│   ├── TimeServlet.java      # Affiche l'heure en temps réel

│   ├── RedirectServlet.java  # Gère les redirections

│   ├── LoginServlet.java     # Gère l'authentification

├── login.html                # Page de connexion HTML

└── styles/

     └── login.css             # Styles pour les formulaires

     └── clock.css             # Styles pour les formulaires

---

## Instructions d'Exécution

### Prérequis
- Serveur compatible Java EE (ex. : Apache Tomcat).
- IDE pour le développement (ex. : IntelliJ IDEA, Eclipse).

### Étapes pour Exécuter
1. **Déployer le Projet** : Copiez `TP02` dans `webapps` de Tomcat.
2. **Démarrer le Serveur** : Lancez Tomcat.
3. **Accéder aux Pages** :
   - **TimeServlet** : `http://localhost:8080/TP02/time`
   - **RedirectServlet** : `http://localhost:8080/TP02/redirect`
   - **Page de Connexion** : `http://localhost:8080/TP02/login.html`

### Remarques
- Vérifiez les ressources (HTML, CSS) sont accessibles.
- Consultez les journaux de Tomcat en cas d'erreurs.
---


## Authors

- [@HarounJoudi](https://www.github.com/)

