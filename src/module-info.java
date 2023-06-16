module cookbook_server {
	requires transitive cookbook_model;
	requires transitive javax.annotation.api;
	requires transitive java.instrument;
	requires transitive java.activation;

	requires transitive java.validation;

	requires transitive javax.persistence;
	requires transitive eclipselink.minus.jpa;
	requires transitive java.sql;

	requires transitive jdk.httpserver;
	requires transitive java.ws.rs;
	requires transitive jersey.server;
	requires transitive jersey.container.jdk.http;

	opens edu.damago.cookbook.server;
}