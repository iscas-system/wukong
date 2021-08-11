-- Adminer 4.8.0 PostgreSQL 13.3 dump

<br />
<b>Warning</b>:  PDO::query(): SQLSTATE[42703]: Undefined column: 7 ERROR:  column &quot;consrc&quot; does not exist
LINE 1: SELECT conname, consrc
                        ^
HINT:  Perhaps you meant to reference the column &quot;pg_constraint.conkey&quot; or the column &quot;pg_constraint.conbin&quot;. in <b>/var/www/html/adminer.php</b> on line <b>185</b><br />
DROP TABLE IF EXISTS "apis";
CREATE TABLE "public"."apis" (
    "provider" character varying(256) NOT NULL,
    "artifactid" character varying(256) NOT NULL,
    "version" character varying(256) NOT NULL,
    "operator" character varying(256) NOT NULL,
    "used" integer NOT NULL
) WITH (oids = false);


<br />
<b>Warning</b>:  PDO::query(): SQLSTATE[42703]: Undefined column: 7 ERROR:  column &quot;consrc&quot; does not exist
LINE 1: SELECT conname, consrc
                        ^
HINT:  Perhaps you meant to reference the column &quot;pg_constraint.conkey&quot; or the column &quot;pg_constraint.conbin&quot;. in <b>/var/www/html/adminer.php</b> on line <b>185</b><br />
DROP TABLE IF EXISTS "versions";
CREATE TABLE "public"."versions" (
    "groupid" character varying(256) NOT NULL,
    "artifactid" character varying(256) NOT NULL,
    "version" character varying(256) NOT NULL,
    "release" timestamp NOT NULL
) WITH (oids = false);


-- 2021-08-11 02:42:01.894629+00
