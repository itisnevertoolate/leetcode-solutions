select distinct p.email from person p inner join person p2 on p.email = p2.email and p.id <> p2.id;