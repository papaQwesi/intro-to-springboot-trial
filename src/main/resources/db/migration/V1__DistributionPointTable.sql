CREATE TABLE distributionPoint(
    id UUID NOT NULL PRIMARY KEY,
    dpName VARCHAR(100) NOT NULL,
    dpLimit INT ,
    dpSlotAvailable INT,
    dpSlotUsed INT,
    dpPoleLocation VARCHAR(100) NOT NULL
);