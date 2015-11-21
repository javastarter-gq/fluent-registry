$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/user.feature");
formatter.feature({
  "line": 1,
  "name": "CRUD for users",
  "description": "",
  "id": "crud-for-users",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "Clean up database",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "no users in database.",
  "keyword": "Given "
});
formatter.match({
  "location": "UserStepdefs.deleteAllUsers()"
});
formatter.result({
  "duration": 284420745,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Create user",
  "description": "",
  "id": "crud-for-users;create-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "create user: Stanislav Trifan, strifan@email.com, qwertyhash",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "find user by email: strifan@email.com",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "found user has name Stanislav Trifan",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "found user has password hash qwertyhash",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "found user was created in less that 1 minute ago",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "found user is enabled",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Stanislav Trifan",
      "offset": 13
    },
    {
      "val": "strifan@email.com",
      "offset": 31
    },
    {
      "val": "qwertyhash",
      "offset": 50
    }
  ],
  "location": "UserStepdefs.createUser(String,String,String)"
});
formatter.result({
  "duration": 18683408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "strifan@email.com",
      "offset": 20
    }
  ],
  "location": "UserStepdefs.findUserByEmail(String)"
});
formatter.result({
  "duration": 84093858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Stanislav Trifan",
      "offset": 20
    }
  ],
  "location": "UserStepdefs.found_user_has_name(String)"
});
formatter.result({
  "duration": 104205,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qwertyhash",
      "offset": 29
    }
  ],
  "location": "UserStepdefs.found_user_has_password_hash_qwertyhash(String)"
});
formatter.result({
  "duration": 76983,
  "status": "passed"
});
formatter.match({
  "location": "UserStepdefs.checkCreateTime()"
});
formatter.result({
  "duration": 47444,
  "status": "passed"
});
formatter.match({
  "location": "UserStepdefs.checkUserIsEnabled()"
});
formatter.result({
  "duration": 45632,
  "status": "passed"
});
});