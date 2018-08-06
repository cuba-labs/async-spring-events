-- begin DEMO_ORDER
create table DEMO_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255),
    SUMMARY varchar(255),
    PROCESSED boolean not null,
    --
    primary key (ID)
)^
-- end DEMO_ORDER
