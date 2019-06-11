CREATE TABLE event
(
    event_id VARCHAR(36) NOT NULL,
    event_name VARCHAR(255) NOT NULL,
    event_data DATE,
    PRIMARY KEY (event_id)
 );