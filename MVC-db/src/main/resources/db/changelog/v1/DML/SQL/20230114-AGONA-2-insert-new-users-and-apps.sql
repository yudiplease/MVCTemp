insert into account(id, username, hash_password, first_name, last_name, updated_date)
values (public.uuid_generate_v4(), 'artem', '1234567890', 'kondratev', 'artem', NOW())
