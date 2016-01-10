# StorageServices

|REST   |SOAP operation name in LDS   |
|---|---|
|GET /person|getPeopleList|
|GET /person/{personId}|getPerson|
|POST /person|createPerson|
|PUT /person/{personId}|updatePerson|
|DELETE /person/{personId}|deletePerson|
|GET /person/{personId}/vitalsings|getVitalSigns|
|||
|GET /person/{personId}/target|getTargetList|
|POST /person/{personId}/target|createTarget|
|PUT /person/{personId}/target/{targetId}|updateTarget|
|DELETE /person/{personId}/target/{targetId}|deleteTarget|
|GET /person/{personId}/target/{measureDefinitionId}|getTarget|
|||
|GET /person/{personId}/reminder|getReminder|
|POST /person/{personId}/reminder|createReminder|
|PUT /person/{personId}/reminder/{reminderId}|updateReminder|
|DELETE /person/{personId}/reminder/{reminderId}|deleteReminder|
|||
|GET /doctor/{doctorId}|getDoctor|
|POST /doctor|createDoctor|
|PUT /doctor/{doctorId}|updateDoctor|
|DELETE /doctor/{doctorId}|deleteDoctor|
|GET /doctor/{doctorId}/patients|getPersonByDoctor|
|||