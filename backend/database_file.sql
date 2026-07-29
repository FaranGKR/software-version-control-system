CREATE DATABASE SoftwareVersionControl;

USE SoftwareVersionControl;

CREATE TABLE Softwares (
    software_id INT AUTO_INCREMENT PRIMARY KEY,
    software_name VARCHAR(100) NOT NULL,
    developer VARCHAR(100),
    category VARCHAR(50),
    current_version VARCHAR(20)
);

CREATE TABLE EndUsers (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    country VARCHAR(50),
    registration_date DATE
);

CREATE TABLE SoftwareReleases (
    release_id INT AUTO_INCREMENT PRIMARY KEY,
    software_id INT,
    version_number VARCHAR(20),
    release_date DATE,
    release_notes TEXT,
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id)
);

CREATE TABLE VersionUpgrades (
    upgrade_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    software_id INT,
    old_version VARCHAR(20),
    new_version VARCHAR(20),
    upgrade_date DATE,
    FOREIGN KEY (user_id) REFERENCES EndUsers(user_id),
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id)
);

CREATE TABLE BugReports (
    bug_id INT AUTO_INCREMENT PRIMARY KEY,
    software_id INT,
    release_id INT,
    reported_by INT,
    bug_title VARCHAR(150),
    bug_description TEXT,
    severity VARCHAR(20),
    status VARCHAR(20),
    reported_date DATE,
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id),
    FOREIGN KEY (release_id) REFERENCES SoftwareReleases(release_id),
    FOREIGN KEY (reported_by) REFERENCES EndUsers(user_id)
);

CREATE TABLE Licenses (
    license_id INT AUTO_INCREMENT PRIMARY KEY,
    software_id INT,
    user_id INT,
    license_key VARCHAR(100) UNIQUE,
    license_type VARCHAR(50),
    issue_date DATE,
    expiry_date DATE,
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id),
    FOREIGN KEY (user_id) REFERENCES EndUsers(user_id)
);

CREATE TABLE Feedback (
    feedback_id INT AUTO_INCREMENT PRIMARY KEY,
    software_id INT,
    user_id INT,
    release_id INT,
    rating INT,
    comments TEXT,
    feedback_date DATE,
    FOREIGN KEY (software_id) REFERENCES Softwares(software_id),
    FOREIGN KEY (user_id) REFERENCES EndUsers(user_id),
    FOREIGN KEY (release_id) REFERENCES SoftwareReleases(release_id)
);

INSERT INTO Softwares (software_name, developer, category, current_version)
VALUES ('PLACEHOLDER_SOFTWARE_NAME', 'PLACEHOLDER_DEVELOPER', 'PLACEHOLDER_CATEGORY', 'PLACEHOLDER_VERSION');

INSERT INTO EndUsers (full_name, email, country, registration_date)
VALUES ('PLACEHOLDER_FULL_NAME', 'PLACEHOLDER_EMAIL', 'PLACEHOLDER_COUNTRY', 'PLACEHOLDER_DATE');

INSERT INTO SoftwareReleases (software_id, version_number, release_date, release_notes)
VALUES (PLACEHOLDER_SOFTWARE_ID, 'PLACEHOLDER_VERSION_NUMBER', 'PLACEHOLDER_DATE', 'PLACEHOLDER_RELEASE_NOTES');

INSERT INTO VersionUpgrades (user_id, software_id, old_version, new_version, upgrade_date)
VALUES (PLACEHOLDER_USER_ID, PLACEHOLDER_SOFTWARE_ID, 'PLACEHOLDER_OLD_VERSION', 'PLACEHOLDER_NEW_VERSION', 'PLACEHOLDER_DATE');

INSERT INTO BugReports (software_id, release_id, reported_by, bug_title, bug_description, severity, status, reported_date)
VALUES (PLACEHOLDER_SOFTWARE_ID, PLACEHOLDER_RELEASE_ID, PLACEHOLDER_USER_ID, 'PLACEHOLDER_BUG_TITLE', 'PLACEHOLDER_BUG_DESCRIPTION', 'PLACEHOLDER_SEVERITY', 'PLACEHOLDER_STATUS', 'PLACEHOLDER_DATE');

INSERT INTO Licenses (software_id, user_id, license_key, license_type, issue_date, expiry_date)
VALUES (PLACEHOLDER_SOFTWARE_ID, PLACEHOLDER_USER_ID, 'PLACEHOLDER_LICENSE_KEY', 'PLACEHOLDER_LICENSE_TYPE', 'PLACEHOLDER_DATE', 'PLACEHOLDER_DATE');

INSERT INTO Feedback (software_id, user_id, release_id, rating, comments, feedback_date)
VALUES (PLACEHOLDER_SOFTWARE_ID, PLACEHOLDER_USER_ID, PLACEHOLDER_RELEASE_ID, PLACEHOLDER_RATING, 'PLACEHOLDER_COMMENTS', 'PLACEHOLDER_DATE');