--1.
select "FirstName" , "LastName" , "CustomerId" , "Country"  from "Customer" c where "Country" != 'USA';
--2.
select * from "Customer" c where "Country" = 'Brazil';
--3.
select 
	"FirstName" , "LastName", "InvoiceId", "InvoiceDate", "BillingCountry" 
from "Customer" c 
join "Invoice" i  
ON c."CustomerId" =i."CustomerId" 
where "Country" = 'Brazil';
--4.
select * from "Employee" e where "Title" like '%Agent'
