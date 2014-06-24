-- ��������
ALTER TABLE `LOCAL_INFO`
	DROP FOREIGN KEY `FK_MANAGER_INFO_TO_LOCAL_INFO`; -- ���������� -> ��������

-- ��������
ALTER TABLE `LOCAL_INFO`
	DROP PRIMARY KEY; -- �������� �⺻Ű

-- ������������
ALTER TABLE `REGION_INFO`
	DROP PRIMARY KEY; -- ������������ �⺻Ű

-- ����������
ALTER TABLE `MANAGER_INFO`
	DROP PRIMARY KEY; -- ���������� �⺻Ű

-- ���������
ALTER TABLE `USER_INFO`
	DROP PRIMARY KEY; -- ��������� �⺻Ű

-- ��������
DROP TABLE IF EXISTS `LOCAL_INFO` RESTRICT;

-- ������������
DROP TABLE IF EXISTS `REGION_INFO` RESTRICT;

-- ����������
DROP TABLE IF EXISTS `MANAGER_INFO` RESTRICT;

-- ���������
DROP TABLE IF EXISTS `USER_INFO` RESTRICT;

-- ��������
CREATE TABLE `LOCAL_INFO` (
	`LOCAL_NO`   INTEGER      NOT NULL COMMENT '������ȣ', -- ������ȣ
	`MANAGER_ID` VARCHAR(255) NULL     COMMENT '������ID', -- ������ID
	`LOCAL_NAME` VARCHAR(50)  NOT NULL COMMENT '�����̸�', -- �����̸�
	`LATITUDE`   VARCHAR(255) NOT NULL COMMENT '����', -- ����
	`LONGITUDE`  VARCHAR(255) NOT NULL COMMENT '�浵', -- �浵
	`ALTITUDE`   VARCHAR(255) NOT NULL COMMENT '��', -- ��
	`AREA_NAME`  VARCHAR(50)  NOT NULL COMMENT '�����̸�' -- �����̸�
)
COMMENT '��������';

-- ��������
ALTER TABLE `LOCAL_INFO`
	ADD CONSTRAINT `PK_LOCAL_INFO` -- �������� �⺻Ű
		PRIMARY KEY (
			`LOCAL_NO` -- ������ȣ
		);

ALTER TABLE `LOCAL_INFO`
	MODIFY COLUMN `LOCAL_NO` INTEGER NOT NULL AUTO_INCREMENT COMMENT '������ȣ';

ALTER TABLE `LOCAL_INFO`
	AUTO_INCREMENT = 1;

-- ������������
CREATE TABLE `REGION_INFO` (
	`REGION_NO`   INTEGER      NOT NULL COMMENT '���ܹ�ȣ', -- ���ܹ�ȣ
	`REGION_NAME` VARCHAR(50)  NOT NULL COMMENT '���������̸�', -- ���������̸�
	`UUID`        VARCHAR(255) NOT NULL COMMENT 'UUID', -- UUID
	`MAJOR`       INTEGER      NOT NULL COMMENT 'major', -- major
	`MINOR`       INTEGER      NOT NULL COMMENT 'minor' -- minor
)
COMMENT '������������';

-- ������������
ALTER TABLE `REGION_INFO`
	ADD CONSTRAINT `PK_REGION_INFO` -- ������������ �⺻Ű
		PRIMARY KEY (
			`REGION_NO` -- ���ܹ�ȣ
		);

ALTER TABLE `REGION_INFO`
	MODIFY COLUMN `REGION_NO` INTEGER NOT NULL AUTO_INCREMENT COMMENT '���ܹ�ȣ';

ALTER TABLE `REGION_INFO`
	AUTO_INCREMENT = 1;

-- ����������
CREATE TABLE `MANAGER_INFO` (
	`MANAGER_ID` VARCHAR(255) NOT NULL COMMENT '������ID', -- ������ID
	`LACAL_NO`   INTEGER      NULL     COMMENT '������ȣ' -- ������ȣ
)
COMMENT '����������';

-- ����������
ALTER TABLE `MANAGER_INFO`
	ADD CONSTRAINT `PK_MANAGER_INFO` -- ���������� �⺻Ű
		PRIMARY KEY (
			`MANAGER_ID` -- ������ID
		);

-- ���������
CREATE TABLE `USER_INFO` (
	`USER_ID`       VARCHAR(255) NOT NULL COMMENT '�����ID', -- �����ID
	`MOBILE_INFO`   VARCHAR(255) NOT NULL COMMENT '�������', -- �������
	`LANGUAGE_INFO` VARCHAR(255) NULL     COMMENT '�������' -- �������
)
COMMENT '���������';

-- ���������
ALTER TABLE `USER_INFO`
	ADD CONSTRAINT `PK_USER_INFO` -- ��������� �⺻Ű
		PRIMARY KEY (
			`USER_ID` -- �����ID
		);

-- ��������
ALTER TABLE `LOCAL_INFO`
	ADD CONSTRAINT `FK_MANAGER_INFO_TO_LOCAL_INFO` -- ���������� -> ��������
		FOREIGN KEY (
			`MANAGER_ID` -- ������ID
		)
		REFERENCES `MANAGER_INFO` ( -- ����������
			`MANAGER_ID` -- ������ID
		);