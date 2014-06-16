DROP SEQUENCE TOUR_LOCAL;

DROP SEQUENCE TOUR_REGION;

DROP SEQUENCE TOUR_DATA;

CREATE SEQUENCE TOUR_LOCAL INCREMENT BY 1 START WITH 1;

CREATE SEQUENCE TOUR_REGION INCREMENT BY 1 START WITH 1;

CREATE SEQUENCE TOUR_DATA INCREMENT BY 1 START WITH 1;


INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager1', '��ȭ��', '37.576037','126.9769', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager2', '��ʹ�', '37.576955','126.976884', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager3', '������', '37.578566','126.976954', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager4', '������', '37.579102','126.977008', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager4', '������', '37.578894', '126.975966', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager5', '������', '37.579523', '126.977071', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager6', '������', '37.579923', '126.97705', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager7', '�ڰ���', '37.580297', '126.97814', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager8', '�ڼ���', '37.579051', '126.977973', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager9', '��ȸ��', '37.579736','126.975956', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager10', '�����', '37.582337','126.977008', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager11', '�¿���', '37.582597', '126.974229', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager12', '��û��', '37.583243', '126.977185', '0', '�溹��');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager13', '������', '37.583434', '126.97609', '0', '�溹��');


/* Test Data ����*/

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager1', '������', '37.576037','127.027621', '0', 'test');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager2', '�ų�����', '37.504724','127.02538', '0', 'test');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager3', '���￪', '37.50081','127.036936', '0', 'test');


/*����(Beacon)����*/
INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '��ġ', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11001');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, 'õ��', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11002');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, 'û�����', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11003');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '������', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11004');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '����', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11005');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '��������', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11006');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '�ƹ̻�', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11007');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '������', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11008');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '�������հ�', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11009');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '�ɴ�', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11010');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '���������', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11011');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '����������', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11012');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '����߻���', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11013');

