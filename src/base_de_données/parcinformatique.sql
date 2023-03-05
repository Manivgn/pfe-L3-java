-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : dim. 29 mai 2022 à 12:16
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `parcinformatique`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `CODEADMIN` varchar(30) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`IDPERSONNE`, `CODEADMIN`) VALUES('24', '1');

-- --------------------------------------------------------

--
-- Structure de la table `a_acces`
--

DROP TABLE IF EXISTS `a_acces`;
CREATE TABLE IF NOT EXISTS `a_acces` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `CODEDOC` decimal(10,0) NOT NULL,
  `DATEACCES` datetime DEFAULT NULL,
  PRIMARY KEY (`IDPERSONNE`,`CODEDOC`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

DROP TABLE IF EXISTS `commande`;
CREATE TABLE IF NOT EXISTS `commande` (
  `NUMCMD` decimal(10,0) NOT NULL,
  `IDPERSONNE` decimal(10,0) DEFAULT NULL,
  `DATECMD` datetime NOT NULL,
  `DATEFACTURATION` datetime DEFAULT NULL,
  PRIMARY KEY (`NUMCMD`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

DROP TABLE IF EXISTS `departement`;
CREATE TABLE IF NOT EXISTS `departement` (
  `IDDEPT` decimal(10,0) NOT NULL,
  `INTITULEDEPT` varchar(40) NOT NULL,
  `NBRESALLE` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`IDDEPT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `documentation`
--

DROP TABLE IF EXISTS `documentation`;
CREATE TABLE IF NOT EXISTS `documentation` (
  `CODEDOC` varchar(25) NOT NULL,
  `IDPERSONNE` decimal(10,0) DEFAULT NULL,
  `LIBELLEDOC` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CODEDOC`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE IF NOT EXISTS `fournisseur` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `CODEFOURNISSEUR` varchar(30) NOT NULL,
  `SOCIETE` varchar(30) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `gere`
--

DROP TABLE IF EXISTS `gere`;
CREATE TABLE IF NOT EXISTS `gere` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `IDMATERIEL` decimal(10,0) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`,`IDMATERIEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `intervention`
--

DROP TABLE IF EXISTS `intervention`;
CREATE TABLE IF NOT EXISTS `intervention` (
  `IDINTERVENTION` decimal(10,0) NOT NULL,
  `DETAILSINTERVENTION` text,
  `DATEDEBUT` datetime NOT NULL,
  `DATEFIN` datetime NOT NULL,
  `STATUT` varchar(20) DEFAULT NULL,
  `PRIORITE` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`IDINTERVENTION`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `maintenance`
--

DROP TABLE IF EXISTS `maintenance`;
CREATE TABLE IF NOT EXISTS `maintenance` (
  `NUMMAINT` decimal(10,0) NOT NULL,
  `IDPERSONNE` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`NUMMAINT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `maintraite`
--

DROP TABLE IF EXISTS `maintraite`;
CREATE TABLE IF NOT EXISTS `maintraite` (
  `NUMMAINT` decimal(10,0) NOT NULL,
  `NUMPANNE` decimal(10,0) NOT NULL,
  PRIMARY KEY (`NUMMAINT`,`NUMPANNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

DROP TABLE IF EXISTS `materiel`;
CREATE TABLE IF NOT EXISTS `materiel` (
  `IDMATERIEL` decimal(10,0) NOT NULL,
  `NUMCMD` decimal(10,0) DEFAULT NULL,
  `NUMSALLE` decimal(10,0) DEFAULT NULL,
  `DATEACQUSITION` datetime NOT NULL,
  `VALEURACQUISITION` varchar(50) NOT NULL,
  `ETATMATERIEL` varchar(30) DEFAULT NULL,
  `MODELEMATERIEL` varchar(40) DEFAULT NULL,
  `CODEFAMILLE` varchar(15) DEFAULT NULL,
  `GARANTIE` varchar(10) DEFAULT NULL,
  `TYPEMATERIEL` varchar(30) NOT NULL,
  PRIMARY KEY (`IDMATERIEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `mconcerne`
--

DROP TABLE IF EXISTS `mconcerne`;
CREATE TABLE IF NOT EXISTS `mconcerne` (
  `NUMMAINT` decimal(10,0) NOT NULL,
  `IDMATERIEL` decimal(10,0) NOT NULL,
  PRIMARY KEY (`NUMMAINT`,`IDMATERIEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ordinateur`
--

DROP TABLE IF EXISTS `ordinateur`;
CREATE TABLE IF NOT EXISTS `ordinateur` (
  `IDMATERIEL` decimal(10,0) NOT NULL,
  `PROCESSUR` varchar(30) DEFAULT NULL,
  `ADRESSEIP` varchar(30) DEFAULT NULL,
  `ADRESSEMAC` varchar(40) DEFAULT NULL,
  `CARTEMERE` varchar(30) DEFAULT NULL,
  `TAILLEECRAN` varchar(15) DEFAULT NULL,
  `CAPACITEDDUR` varchar(30) DEFAULT NULL,
  `CARTERESEAU` varchar(30) DEFAULT NULL,
  `OS` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`IDMATERIEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `panne`
--

DROP TABLE IF EXISTS `panne`;
CREATE TABLE IF NOT EXISTS `panne` (
  `NUMPANNE` decimal(10,0) NOT NULL,
  `IDMATERIEL` int(11) DEFAULT NULL,
  `IDPERSONNE` decimal(10,0) DEFAULT NULL,
  `IDINTERVENTION` decimal(10,0) DEFAULT NULL,
  `CODEPANNE` varchar(20) NOT NULL,
  `DATEPANNE` timestamp NOT NULL,
  `DESCRIPTIONPANNE` text,
  PRIMARY KEY (`NUMPANNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `NOM` varchar(40) NOT NULL,
  `PRENOM` varchar(40) NOT NULL,
  `LOGIN` varchar(40) NOT NULL,
  `PASSWORD` varchar(40) NOT NULL,
  `TEL` varchar(20) DEFAULT NULL,
  `ADRESSE` varchar(100) DEFAULT NULL,
  `MAIL` varchar(40) NOT NULL,
  `TYPEPERSONNE` varchar(15) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`IDPERSONNE`, `NOM`, `PRENOM`, `LOGIN`, `PASSWORD`, `TEL`, `ADRESSE`, `MAIL`, `TYPEPERSONNE`) VALUES('24', 'KOKOU', 'JON', 'sisi', 'passwordw', '06897487478478', 'HBHWVHCW', 'HHCHEC@EBHE', 'utilisateur');
INSERT INTO `personne` (`IDPERSONNE`, `NOM`, `PRENOM`, `LOGIN`, `PASSWORD`, `TEL`, `ADRESSE`, `MAIL`, `TYPEPERSONNE`) VALUES('1', 'komla', 'mani', 'komlamani', 'essai', NULL, NULL, '', 'administrateur');
INSERT INTO `personne` (`IDPERSONNE`, `NOM`, `PRENOM`, `LOGIN`, `PASSWORD`, `TEL`, `ADRESSE`, `MAIL`, `TYPEPERSONNE`) VALUES('25', 'kof', 'koffi', 'd', 'd', NULL, NULL, '', 'fournisseur');

-- --------------------------------------------------------

--
-- Structure de la table `reparateur`
--

DROP TABLE IF EXISTS `reparateur`;
CREATE TABLE IF NOT EXISTS `reparateur` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `CODEREPARATEUR` varchar(30) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reparateur`
--

INSERT INTO `reparateur` (`IDPERSONNE`, `CODEREPARATEUR`) VALUES('23', '1');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `NUMSALLE` decimal(10,0) NOT NULL,
  `IDDEPT` decimal(10,0) DEFAULT NULL,
  `LIBELLESALLE` varchar(50) NOT NULL,
  PRIMARY KEY (`NUMSALLE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `soccupeinterven`
--

DROP TABLE IF EXISTS `soccupeinterven`;
CREATE TABLE IF NOT EXISTS `soccupeinterven` (
  `IDINTERVENTION` decimal(10,0) NOT NULL,
  `IDPERSONNE` decimal(10,0) NOT NULL,
  PRIMARY KEY (`IDINTERVENTION`,`IDPERSONNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `software`
--

DROP TABLE IF EXISTS `software`;
CREATE TABLE IF NOT EXISTS `software` (
  `IDMATERIEL` decimal(10,0) NOT NULL,
  `NOMSOFT` varchar(50) NOT NULL,
  `TYPESOFT` varchar(50) DEFAULT NULL,
  `LICENCESOFT` varchar(40) NOT NULL,
  `VERSIONSOFT` varchar(40) DEFAULT NULL,
  `DUREELICENCE` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`IDMATERIEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `CODEUTILISATEUR` varchar(40) NOT NULL,
  `TITREUTILISATEUR` varchar(40) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilise`
--

DROP TABLE IF EXISTS `utilise`;
CREATE TABLE IF NOT EXISTS `utilise` (
  `IDPERSONNE` decimal(10,0) NOT NULL,
  `IDMATERIEL` decimal(10,0) NOT NULL,
  PRIMARY KEY (`IDPERSONNE`,`IDMATERIEL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
