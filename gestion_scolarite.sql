-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 21 avr. 2022 à 12:11
-- Version du serveur :  10.4.14-MariaDB
-- Version de PHP : 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_scolarite`
--

-- --------------------------------------------------------

--
-- Structure de la table `absence`
--

CREATE TABLE `absence` (
  `ID_COURS` int(11) NOT NULL,
  `NUM_INSC` int(11) NOT NULL,
  `NUMBER` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `chef_departement`
--

CREATE TABLE `chef_departement` (
  `CNSS` int(11) NOT NULL,
  `ID_DEP` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `ID` int(11) NOT NULL,
  `DATE_DEB` date NOT NULL,
  `DATE_CLOT` date NOT NULL,
  `ID_MAT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE `departement` (
  `ID` int(11) NOT NULL,
  `NOM` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE `enseignant` (
  `CNSS` int(11) NOT NULL,
  `ID_PERS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `enseignant_groupe`
--

CREATE TABLE `enseignant_groupe` (
  `ID_GRP` int(11) NOT NULL,
  `CNSS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `ID_PERS` int(11) NOT NULL,
  `NUM_INSC` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant_groupe`
--

CREATE TABLE `etudiant_groupe` (
  `ID_GRP` int(11) NOT NULL,
  `NUM_INSC` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

CREATE TABLE `groupe` (
  `ID` int(11) NOT NULL,
  `NOM` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `horraire_cours`
--

CREATE TABLE `horraire_cours` (
  `ID_COURS` int(11) NOT NULL,
  `JOUR` varchar(50) NOT NULL,
  `HEURE_DEB` time NOT NULL,
  `DUREE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE `matiere` (
  `ID` int(11) NOT NULL,
  `ID_GRP` int(11) NOT NULL,
  `CNSS` int(11) NOT NULL,
  `NOM` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

CREATE TABLE `note` (
  `ID_MAT` int(11) NOT NULL,
  `NUM_INSC` int(11) NOT NULL,
  `TYPE` varchar(50) NOT NULL,
  `NOTE` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE `personne` (
  `ID` int(11) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `PRENOM` varchar(50) NOT NULL,
  `ADRESSE` int(70) NOT NULL,
  `TEL` int(8) NOT NULL,
  `MAIL` int(100) NOT NULL,
  `CIN` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `ID` int(11) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `PERMISSION` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `ID_PERS` int(11) NOT NULL,
  `ID_ROLE` int(11) NOT NULL,
  `MATRICULE` varchar(50) NOT NULL,
  `PASS` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `absence`
--
ALTER TABLE `absence`
  ADD PRIMARY KEY (`ID_COURS`,`NUM_INSC`),
  ADD KEY `etd_absence` (`NUM_INSC`);

--
-- Index pour la table `chef_departement`
--
ALTER TABLE `chef_departement`
  ADD PRIMARY KEY (`CNSS`,`ID_DEP`),
  ADD KEY `chef_departement` (`ID_DEP`);

--
-- Index pour la table `cours`
--
ALTER TABLE `cours`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `cours_matiere` (`ID_MAT`);

--
-- Index pour la table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`CNSS`),
  ADD KEY `personne_enseignant` (`ID_PERS`);

--
-- Index pour la table `enseignant_groupe`
--
ALTER TABLE `enseignant_groupe`
  ADD PRIMARY KEY (`ID_GRP`,`CNSS`),
  ADD KEY `groupe_ens` (`CNSS`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`NUM_INSC`),
  ADD KEY `personne_etudiant` (`ID_PERS`);

--
-- Index pour la table `etudiant_groupe`
--
ALTER TABLE `etudiant_groupe`
  ADD KEY `groupe_etd` (`NUM_INSC`),
  ADD KEY `groupe_getd` (`ID_GRP`);

--
-- Index pour la table `groupe`
--
ALTER TABLE `groupe`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `horraire_cours`
--
ALTER TABLE `horraire_cours`
  ADD PRIMARY KEY (`ID_COURS`);

--
-- Index pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `matiere_groupe` (`ID_GRP`),
  ADD KEY `matiere_enseignant` (`CNSS`);

--
-- Index pour la table `note`
--
ALTER TABLE `note`
  ADD PRIMARY KEY (`ID_MAT`,`NUM_INSC`,`TYPE`),
  ADD KEY `note_etudiant` (`NUM_INSC`);

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID_PERS`,`ID_ROLE`),
  ADD KEY `user_role` (`ID_ROLE`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `cours`
--
ALTER TABLE `cours`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `departement`
--
ALTER TABLE `departement`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `groupe`
--
ALTER TABLE `groupe`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `matiere`
--
ALTER TABLE `matiere`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `personne`
--
ALTER TABLE `personne`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `role`
--
ALTER TABLE `role`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `absence`
--
ALTER TABLE `absence`
  ADD CONSTRAINT `absence_cours` FOREIGN KEY (`ID_COURS`) REFERENCES `cours` (`ID`),
  ADD CONSTRAINT `etd_absence` FOREIGN KEY (`NUM_INSC`) REFERENCES `etudiant` (`NUM_INSC`);

--
-- Contraintes pour la table `chef_departement`
--
ALTER TABLE `chef_departement`
  ADD CONSTRAINT `chef_departement` FOREIGN KEY (`ID_DEP`) REFERENCES `departement` (`ID`),
  ADD CONSTRAINT `departement_enseignant` FOREIGN KEY (`CNSS`) REFERENCES `enseignant` (`CNSS`);

--
-- Contraintes pour la table `cours`
--
ALTER TABLE `cours`
  ADD CONSTRAINT `cours_matiere` FOREIGN KEY (`ID_MAT`) REFERENCES `matiere` (`ID`);

--
-- Contraintes pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD CONSTRAINT `personne_enseignant` FOREIGN KEY (`ID_PERS`) REFERENCES `personne` (`ID`);

--
-- Contraintes pour la table `enseignant_groupe`
--
ALTER TABLE `enseignant_groupe`
  ADD CONSTRAINT `groupe_ens` FOREIGN KEY (`CNSS`) REFERENCES `enseignant` (`CNSS`),
  ADD CONSTRAINT `groupe_ge` FOREIGN KEY (`ID_GRP`) REFERENCES `groupe` (`ID`);

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD CONSTRAINT `personne_etudiant` FOREIGN KEY (`ID_PERS`) REFERENCES `personne` (`ID`);

--
-- Contraintes pour la table `etudiant_groupe`
--
ALTER TABLE `etudiant_groupe`
  ADD CONSTRAINT `groupe_etd` FOREIGN KEY (`NUM_INSC`) REFERENCES `etudiant` (`NUM_INSC`),
  ADD CONSTRAINT `groupe_getd` FOREIGN KEY (`ID_GRP`) REFERENCES `groupe` (`ID`);

--
-- Contraintes pour la table `horraire_cours`
--
ALTER TABLE `horraire_cours`
  ADD CONSTRAINT `horraire` FOREIGN KEY (`ID_COURS`) REFERENCES `cours` (`ID`);

--
-- Contraintes pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD CONSTRAINT `matiere_enseignant` FOREIGN KEY (`CNSS`) REFERENCES `enseignant` (`CNSS`),
  ADD CONSTRAINT `matiere_groupe` FOREIGN KEY (`ID_GRP`) REFERENCES `groupe` (`ID`);

--
-- Contraintes pour la table `note`
--
ALTER TABLE `note`
  ADD CONSTRAINT `note_etudiant` FOREIGN KEY (`NUM_INSC`) REFERENCES `etudiant` (`NUM_INSC`),
  ADD CONSTRAINT `note_matiere` FOREIGN KEY (`ID_MAT`) REFERENCES `matiere` (`ID`);

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_personne` FOREIGN KEY (`ID_PERS`) REFERENCES `personne` (`ID`),
  ADD CONSTRAINT `user_role` FOREIGN KEY (`ID_ROLE`) REFERENCES `personne` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
