/*************************************************************************************************************************************/

CREATE DATABASE productmanagementdb ;


/*************************************************************************************************************************************/

/*  creating user table for authentication process and registration process  */

/*************************************************************************************************************************************/

CREATE TABLE `user_entity` (
  `email` varchar(255) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



/*************************************************************************************************************************************/

/*  creating the product table for searching  */ 

/*************************************************************************************************************************************/

CREATE TABLE `product_entity` (
  `product_code` varchar(255) NOT NULL,
  `product_brand` varchar(255) DEFAULT NULL,
  `product_details` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_price` double DEFAULT NULL,
  `product_imageurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



/*************************************************************************************************************************************/

/*  creating the delivery table to check serviceability */

/*************************************************************************************************************************************/

CREATE TABLE `delivery_entity` (
  `product_code` varchar(255) NOT NULL,
  `pin_code` int(11) NOT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_code`,`pin_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


/*********************************************************************************/


/*  NOTE USE REGISTRATION PAGE TO CREATE A USER since Password will be encrypted 
 *  thus inserting directly to DB might not authenticate by decrypter
*/

/*********************************************************************************/


/*************************************************************************************************************************************/

/*  Inserting Data to product table for testing   */

/*************************************************************************************************************************************/
INSERT INTO `productmanagementdb`.`product_entity`
(`product_code`,
`product_brand`,
`product_details`,
`product_name`,
`product_price`,
`product_imageurl`)
VALUES
("A112","Nike","Shirt for Men","TShirt",4000,"https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/12916366/2020/12/7/8554eb1a-5359-4446-bc56-96a4f40289451607321330360-Nike-Men-Black-Solid-Round-Neck-T-shirt-6171607321328606-1.jpg");


INSERT INTO `productmanagementdb`.`product_entity`
(`product_code`,
`product_brand`,
`product_details`,
`product_name`,
`product_price`,
`product_imageurl`)
VALUES
("A1X2","Adidas","Shirt for Women","TShirt",2000,"https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/14746280/2021/9/10/d636243a-eb8d-41a2-881c-4ef171d62de81631264790052-ADIDAS-Men-Black--White-Printed-Brand-Logo-Print-Sweatshirt--1.jpg");


INSERT INTO `productmanagementdb`.`product_entity` 
(`product_code`,
`product_brand`,
`product_details`,
`product_name`,
`product_price`,
`product_imageurl`)
 VALUES 
 ('12AA','peter','pants','42 size',2499,'https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/productimage/2021/4/21/6fd04638-3840-48cd-a4f0-917195a8f52d1619004721864-1.jpg');


INSERT INTO `productmanagementdb`.`product_entity` 
(`product_code`,
`product_brand`,
`product_details`,
`product_name`,
`product_price`,
`product_imageurl`)
 VALUES 
 ('A174','Nike','shirt for men','XXL Shirt',3000,'https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/12916366/2020/12/7/8554eb1a-5359-4446-bc56-96a4f40289451607321330360-Nike-Men-Black-Solid-Round-Neck-T-shirt-6171607321328606-1.jpg');


INSERT INTO `productmanagementdb`.`product_entity` 
(`product_code`,
`product_brand`,
`product_details`,
`product_name`,
`product_price`,
`product_imageurl`) 
VALUES 
('A175','adidas','shirt for women','XL Shirt',2500,'https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/14746280/2021/9/10/d636243a-eb8d-41a2-881c-4ef171d62de81631264790052-ADIDAS-Men-Black--White-Printed-Brand-Logo-Print-Sweatshirt--1.jpg');


INSERT INTO `productmanagementdb`.`product_entity` 
(`product_code`,
`product_brand`,
`product_details`,
`product_name`,
`product_price`,
`product_imageurl`) 
VALUES 
('QAZ1','polo','shirt for all','M size',50000,'https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/12352244/2020/9/25/df7bb6fd-1ae4-4ace-bab4-60a29ef641ad1601024873160-Puma-Men-Grey-First-Mile-Xtreme-dryCELL-Self-Design-Training-1.jpg');


/*************************************************************************************************************************************/

/*  Inserting Data to delivery table for testing   */

/*************************************************************************************************************************************/


INSERT INTO `productmanagementdb`.`delivery_entity`
(`product_code`,
`pin_code`,
`state`)
VALUES
('12AA',211006,'UP');


INSERT INTO `productmanagementdb`.`delivery_entity`
(`product_code`,
`pin_code`,
`state`)
VALUES
('A1X2',124589,'KK');

INSERT INTO `productmanagementdb`.`delivery_entity`
(`product_code`,
`pin_code`,
`state`)
VALUES
('QAZ1',211804,'MP');

INSERT INTO `productmanagementdb`.`delivery_entity`
(`product_code`,
`pin_code`,
`state`)
VALUES
('A175',145857,'KK');


INSERT INTO `productmanagementdb`.`delivery_entity`
(`product_code`,
`pin_code`,
`state`)
VALUES
('A174',211804,'UP');



INSERT INTO `productmanagementdb`.`delivery_entity`
(`product_code`,
`pin_code`,
`state`)
VALUES
('A174',211006,'UP');

