INSERT INTO tags (title) VALUES ('Finance');
INSERT INTO tags (title) VALUES ('Business');
INSERT INTO tags (title) VALUES ('Productivity');
INSERT INTO tags (title) VALUES ('No-Code');
INSERT INTO tags (title) VALUES ('Design');
INSERT INTO tags (title) VALUES ('Tool');

INSERT INTO companies (description, image_url, title) VALUES('Lorem ipsum dolor sit amet.', 'http://placehold.jp/60x60.png', 'Slack');
INSERT INTO companies (description, image_url, title) VALUES('Lorem ipsum dolor sit amet.', 'http://placehold.jp/60x60.png', 'Carrd');
INSERT INTO companies (description, image_url, title) VALUES('Lorem ipsum dolor sit amet.', 'http://placehold.jp/60x60.png', 'Polymail');
INSERT INTO companies (description, image_url, title) VALUES('Lorem ipsum dolor sit amet.', 'http://placehold.jp/60x60.png', 'Doppler');
INSERT INTO companies (description, image_url, title) VALUES('Lorem ipsum dolor sit amet.', 'http://placehold.jp/60x60.png', 'Vault3');
INSERT INTO companies (description, image_url, title) VALUES('Lorem ipsum dolor sit amet.', 'http://placehold.jp/60x60.png', 'Hotjar');

INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Tools', 'PRODUCT');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Marketing', 'PRODUCT');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Productivity', 'PRODUCT');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Design', 'PRODUCT');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Technology', 'PRODUCT');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Analytics', 'PRODUCT');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Tools', 'BUSINESS_IDEA');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Marketing', 'BUSINESS_IDEA');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Productivity', 'BUSINESS_IDEA');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Design', 'BUSINESS_IDEA');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Technology', 'BUSINESS_IDEA');
INSERT INTO categories (image_url, title, "type") VALUES('http://placehold.jp/40x40.png', 'Analytics', 'BUSINESS_IDEA');

INSERT INTO products (description, title, upvotes, category_id) VALUES ('Lorem ipsum dolor sit amet.', 'Slack', 12, 1);
INSERT INTO products (description, title, upvotes, category_id) VALUES ('Lorem ipsum dolor sit amet.', 'Carrd', 99, 2);
INSERT INTO products (description, title, upvotes, category_id) VALUES ('Lorem ipsum dolor sit amet.', 'Polymail', 76, 3);
INSERT INTO products (description, title, upvotes, category_id) VALUES ('Lorem ipsum dolor sit amet.', 'Doppler', 65, 4);
INSERT INTO products (description, title, upvotes, category_id) VALUES ('Lorem ipsum dolor sit amet.', 'Vault3', 48, 5);
INSERT INTO products (description, title, upvotes, category_id) VALUES ('Lorem ipsum dolor sit amet.', 'Hotjar', 25, 6);

INSERT INTO product_image (image_url, product_id) VALUES('http://placehold.jp/200x200.png', 1);
INSERT INTO product_image (image_url, product_id) VALUES('http://placehold.jp/200x200.png', 2);
INSERT INTO product_image (image_url, product_id) VALUES('http://placehold.jp/200x200.png', 3);
INSERT INTO product_image (image_url, product_id) VALUES('http://placehold.jp/200x200.png', 4);
INSERT INTO product_image (image_url, product_id) VALUES('http://placehold.jp/200x200.png', 5);

INSERT INTO product_comment ("comment", full_name, product_id) VALUES('Good product', 'Renee', 1);
INSERT INTO product_comment ("comment", full_name, product_id) VALUES('Good product', 'Pratt', 2);
INSERT INTO product_comment ("comment", full_name, product_id) VALUES('Good product', 'Tiffany', 3);
INSERT INTO product_comment ("comment", full_name, product_id) VALUES('Good product', 'Sherrie', 4);
INSERT INTO product_comment ("comment", full_name, product_id) VALUES('Good product', 'Jenkins', 5);
INSERT INTO product_comment ("comment", full_name, product_id) VALUES('Good product', 'Terrell', 6);

INSERT INTO products_tags (product_id, tags_id) VALUES(1, 1);
INSERT INTO products_tags (product_id, tags_id) VALUES(1, 2);
INSERT INTO products_tags (product_id, tags_id) VALUES(2, 3);
INSERT INTO products_tags (product_id, tags_id) VALUES(2, 4);
INSERT INTO products_tags (product_id, tags_id) VALUES(3, 5);
INSERT INTO products_tags (product_id, tags_id) VALUES(3, 6);

INSERT INTO ideas (description, title, upvotes, category_id) VALUES('Lorem ipsum dolor sit amet.', 'New idea', 12, 1);
INSERT INTO ideas (description, title, upvotes, category_id) VALUES('Lorem ipsum dolor sit amet.', 'New idea 2', 43, 2);
INSERT INTO ideas (description, title, upvotes, category_id) VALUES('Lorem ipsum dolor sit amet.', 'New idea 3', 33, 3);
INSERT INTO ideas (description, title, upvotes, category_id) VALUES('Lorem ipsum dolor sit amet.', 'New idea 4', 65, 4);
INSERT INTO ideas (description, title, upvotes, category_id) VALUES('Lorem ipsum dolor sit amet.', 'New idea 5', 10, 5);
INSERT INTO ideas (description, title, upvotes, category_id) VALUES('Lorem ipsum dolor sit amet.', 'New idea 6', 86, 6);

INSERT INTO proposals (problem_text, solution_text, title, upvotes, company_id) VALUES('Problem', 'Solution', 'We have a problem', 22, 1);
INSERT INTO proposals (problem_text, solution_text, title, upvotes, company_id) VALUES('Problem', 'Solution', 'We have a problem', 53, 2);
INSERT INTO proposals (problem_text, solution_text, title, upvotes, company_id) VALUES('Problem', 'Solution', 'We have a problem', 14, 3);
INSERT INTO proposals (problem_text, solution_text, title, upvotes, company_id) VALUES('Problem', 'Solution', 'We have a problem', 96, 4);
INSERT INTO proposals (problem_text, solution_text, title, upvotes, company_id) VALUES('Problem', 'Solution', 'We have a problem', 54, 5);
INSERT INTO proposals (problem_text, solution_text, title, upvotes, company_id) VALUES('Problem', 'Solution', 'We have a problem', 69, 6);

