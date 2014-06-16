DROP SEQUENCE TOUR_LOCAL;

DROP SEQUENCE TOUR_REGION;

DROP SEQUENCE TOUR_DATA;

CREATE SEQUENCE TOUR_LOCAL INCREMENT BY 1 START WITH 1;

CREATE SEQUENCE TOUR_REGION INCREMENT BY 1 START WITH 1;

CREATE SEQUENCE TOUR_DATA INCREMENT BY 1 START WITH 1;


INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager1', '광화문', '37.576037','126.9769', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager2', '흥례문', '37.576955','126.976884', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager3', '근정전', '37.578566','126.976954', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager4', '사정전', '37.579102','126.977008', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager4', '수정전', '37.578894', '126.975966', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager5', '강녕전', '37.579523', '126.977071', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager6', '교태전', '37.579923', '126.97705', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager7', '자경전', '37.580297', '126.97814', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager8', '자선당', '37.579051', '126.977973', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager9', '경회루', '37.579736','126.975956', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager10', '향원정', '37.582337','126.977008', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager11', '태원전', '37.582597', '126.974229', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager12', '건청궁', '37.583243', '126.977185', '0', '경복궁');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager13', '집옥재', '37.583434', '126.97609', '0', '경복궁');


/* Test Data 정보*/

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager1', '강남역', '37.576037','127.027621', '0', 'test');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager2', '신논현역', '37.504724','127.02538', '0', 'test');

INSERT INTO local_info (local_no, manager_id, local_name, latitude, longitude, altitude, area_name)
VALUES (TOUR_LOCAL.nextval, 'manager3', '역삼역', '37.50081','127.036936', '0', 'test');


/*비콘(Beacon)정보*/
INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '해치', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11001');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '천록', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11002');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '청동향로', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11003');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '무쇠드므', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11004');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '월대', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11005');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '북측담장', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11006');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '아미산', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11007');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '옥루기륜', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11008');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '지붕의합각', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11009');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '꽃담', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11010');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '십장생굴뚝', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11011');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '열상진원샘', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11012');

INSERT INTO region_info (region_no, region_name, uuid, major, minor)
VALUES (TOUR_REGION.nextval, '전기발상지', '8492e75f-4fd6-469d-b132-043fe94921d8', '11', '11013');

