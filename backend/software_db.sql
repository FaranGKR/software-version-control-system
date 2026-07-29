
CREATE DATABASE software_management;
USE software_management;
CREATE TABLE Softwares (
    software_id INT PRIMARY KEY AUTO_INCREMENT,
    software_name VARCHAR(100) NOT NULL,
    description TEXT,
    developer VARCHAR(100),
    current_version VARCHAR(20),
    release_date DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE End_Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    operating_system VARCHAR(50),
    registration_date DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Software_Releases (
    release_id INT PRIMARY KEY AUTO_INCREMENT,
    software_id INT NOT NULL,
    version_number VARCHAR(20) NOT NULL,
    release_date DATE NOT NULL,
    release_notes TEXT,
    release_type ENUM('Major', 'Minor', 'Patch') NOT NULL,

    FOREIGN KEY (software_id)
        REFERENCES Softwares(software_id)
        ON DELETE CASCADE
);

CREATE TABLE Version_Upgrades (
    upgrade_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    release_id INT NOT NULL,
    previous_version VARCHAR(20),
    upgraded_version VARCHAR(20),
    upgrade_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    upgrade_status ENUM('Successful', 'Failed', 'Pending') DEFAULT 'Pending',

    FOREIGN KEY (user_id)
        REFERENCES End_Users(user_id)
        ON DELETE CASCADE,

    FOREIGN KEY (release_id)
        REFERENCES Software_Releases(release_id)
        ON DELETE CASCADE
);