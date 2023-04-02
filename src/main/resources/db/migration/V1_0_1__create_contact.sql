drop table if exists public.contact;

create table if not exists public.contact
(
    id uuid primary key not null,
    first_name varchar not null,
    last_name varchar not null,
    patronymic varchar not null,
    job_post varchar,
    department varchar,
    struct varchar,
    audience varchar,
    internal_number varchar,
    landline_number varchar
);

insert into public.contact(id, first_name, last_name, patronymic, job_post, department, struct, audience, internal_number, landline_number) values
(gen_random_uuid(), 'first_name1', 'last_name1', 'patronymic1', null, null, null, null, null, null),
(gen_random_uuid(), 'first_name2', 'last_name2', 'patronymic2', null, null, null, null, null, null),
(gen_random_uuid(), 'first_name3', 'last_name3', 'patronymic3', null, null, null, null, null, null);