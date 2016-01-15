
package introsde.finalproject.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.finalproject.soap.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateMeasure_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createMeasure");
    private final static QName _UpdateMeasure_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateMeasure");
    private final static QName _DeleteDoctorResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteDoctorResponse");
    private final static QName _GetDoctor_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getDoctor");
    private final static QName _Reminders_QNAME = new QName("http://ws.soap.finalproject.introsde/", "Reminders");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deletePersonResponse");
    private final static QName _GetMeasure_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getMeasure");
    private final static QName _GetTarget_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getTarget");
    private final static QName _CreateDoctor_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createDoctor");
    private final static QName _CreateTarget_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createTarget");
    private final static QName _GetReminder_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getReminder");
    private final static QName _CreateReminder_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createReminder");
    private final static QName _DeleteReminder_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteReminder");
    private final static QName _GetMeasureResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getMeasureResponse");
    private final static QName _UpdateTargetResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateTargetResponse");
    private final static QName _GetTargetResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getTargetResponse");
    private final static QName _DeleteMeasure_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteMeasure");
    private final static QName _GetCurrentHealth_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getCurrentHealth");
    private final static QName _GetDoctorResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getDoctorResponse");
    private final static QName _GetMeasureDefinitionResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getMeasureDefinitionResponse");
    private final static QName _GetPerson_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getPerson");
    private final static QName _DeleteTargetResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteTargetResponse");
    private final static QName _UpdateTarget_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateTarget");
    private final static QName _GetCurrentHealthResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getCurrentHealthResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deletePerson");
    private final static QName _CreateTargetResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createTargetResponse");
    private final static QName _UpdateReminder_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateReminder");
    private final static QName _UpdateReminderResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateReminderResponse");
    private final static QName _GetTargetListResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getTargetListResponse");
    private final static QName _MeasureTypes_QNAME = new QName("http://ws.soap.finalproject.introsde/", "measureTypes");
    private final static QName _GetPersonResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getPersonResponse");
    private final static QName _UpdateDoctorResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateDoctorResponse");
    private final static QName _GetPersonByDoctor_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getPersonByDoctor");
    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteMeasureResponse");
    private final static QName _GetVitalSigns_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getVitalSigns");
    private final static QName _CreateMeasureResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createMeasureResponse");
    private final static QName _DeleteReminderResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteReminderResponse");
    private final static QName _DeleteTarget_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteTarget");
    private final static QName _UpdateDoctor_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateDoctor");
    private final static QName _GetVitalSignsResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getVitalSignsResponse");
    private final static QName _GetFamilyResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getFamilyResponse");
    private final static QName _GetFamily_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getFamily");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getPeopleListResponse");
    private final static QName _GetMeasureDefinition_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getMeasureDefinition");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updatePersonResponse");
    private final static QName _GetReminderResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getReminderResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updatePerson");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getPeopleList");
    private final static QName _ParseException_QNAME = new QName("http://ws.soap.finalproject.introsde/", "ParseException");
    private final static QName _GetTargetList_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getTargetList");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "updateMeasureResponse");
    private final static QName _Measurements_QNAME = new QName("http://ws.soap.finalproject.introsde/", "Measurements");
    private final static QName _CreateDoctorResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createDoctorResponse");
    private final static QName _DeleteDoctor_QNAME = new QName("http://ws.soap.finalproject.introsde/", "deleteDoctor");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createPersonResponse");
    private final static QName _GetPersonByDoctorResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "getPersonByDoctorResponse");
    private final static QName _CreateReminderResponse_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createReminderResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.soap.finalproject.introsde/", "createPerson");
    private final static QName _People_QNAME = new QName("http://ws.soap.finalproject.introsde/", "People");
    private final static QName _Targets_QNAME = new QName("http://ws.soap.finalproject.introsde/", "Targets");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.finalproject.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetTargetResponse }
     * 
     */
    public GetTargetResponse createGetTargetResponse() {
        return new GetTargetResponse();
    }

    /**
     * Create an instance of {@link DeleteReminder }
     * 
     */
    public DeleteReminder createDeleteReminder() {
        return new DeleteReminder();
    }

    /**
     * Create an instance of {@link GetMeasureResponse }
     * 
     */
    public GetMeasureResponse createGetMeasureResponse() {
        return new GetMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdateTargetResponse }
     * 
     */
    public UpdateTargetResponse createUpdateTargetResponse() {
        return new UpdateTargetResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link GetCurrentHealth }
     * 
     */
    public GetCurrentHealth createGetCurrentHealth() {
        return new GetCurrentHealth();
    }

    /**
     * Create an instance of {@link DeleteDoctorResponse }
     * 
     */
    public DeleteDoctorResponse createDeleteDoctorResponse() {
        return new DeleteDoctorResponse();
    }

    /**
     * Create an instance of {@link ListReminderWrapper }
     * 
     */
    public ListReminderWrapper createListReminderWrapper() {
        return new ListReminderWrapper();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetMeasure }
     * 
     */
    public GetMeasure createGetMeasure() {
        return new GetMeasure();
    }

    /**
     * Create an instance of {@link GetTarget }
     * 
     */
    public GetTarget createGetTarget() {
        return new GetTarget();
    }

    /**
     * Create an instance of {@link GetDoctor }
     * 
     */
    public GetDoctor createGetDoctor() {
        return new GetDoctor();
    }

    /**
     * Create an instance of {@link CreateMeasure }
     * 
     */
    public CreateMeasure createCreateMeasure() {
        return new CreateMeasure();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     * 
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link GetReminder }
     * 
     */
    public GetReminder createGetReminder() {
        return new GetReminder();
    }

    /**
     * Create an instance of {@link CreateReminder }
     * 
     */
    public CreateReminder createCreateReminder() {
        return new CreateReminder();
    }

    /**
     * Create an instance of {@link CreateTarget }
     * 
     */
    public CreateTarget createCreateTarget() {
        return new CreateTarget();
    }

    /**
     * Create an instance of {@link CreateDoctor }
     * 
     */
    public CreateDoctor createCreateDoctor() {
        return new CreateDoctor();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link GetCurrentHealthResponse }
     * 
     */
    public GetCurrentHealthResponse createGetCurrentHealthResponse() {
        return new GetCurrentHealthResponse();
    }

    /**
     * Create an instance of {@link UpdateTarget }
     * 
     */
    public UpdateTarget createUpdateTarget() {
        return new UpdateTarget();
    }

    /**
     * Create an instance of {@link UpdateReminderResponse }
     * 
     */
    public UpdateReminderResponse createUpdateReminderResponse() {
        return new UpdateReminderResponse();
    }

    /**
     * Create an instance of {@link GetTargetListResponse }
     * 
     */
    public GetTargetListResponse createGetTargetListResponse() {
        return new GetTargetListResponse();
    }

    /**
     * Create an instance of {@link ListMeasureDefinitionWrapper }
     * 
     */
    public ListMeasureDefinitionWrapper createListMeasureDefinitionWrapper() {
        return new ListMeasureDefinitionWrapper();
    }

    /**
     * Create an instance of {@link CreateTargetResponse }
     * 
     */
    public CreateTargetResponse createCreateTargetResponse() {
        return new CreateTargetResponse();
    }

    /**
     * Create an instance of {@link UpdateReminder }
     * 
     */
    public UpdateReminder createUpdateReminder() {
        return new UpdateReminder();
    }

    /**
     * Create an instance of {@link GetMeasureDefinitionResponse }
     * 
     */
    public GetMeasureDefinitionResponse createGetMeasureDefinitionResponse() {
        return new GetMeasureDefinitionResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetDoctorResponse }
     * 
     */
    public GetDoctorResponse createGetDoctorResponse() {
        return new GetDoctorResponse();
    }

    /**
     * Create an instance of {@link DeleteTargetResponse }
     * 
     */
    public DeleteTargetResponse createDeleteTargetResponse() {
        return new DeleteTargetResponse();
    }

    /**
     * Create an instance of {@link DeleteReminderResponse }
     * 
     */
    public DeleteReminderResponse createDeleteReminderResponse() {
        return new DeleteReminderResponse();
    }

    /**
     * Create an instance of {@link DeleteTarget }
     * 
     */
    public DeleteTarget createDeleteTarget() {
        return new DeleteTarget();
    }

    /**
     * Create an instance of {@link UpdateDoctor }
     * 
     */
    public UpdateDoctor createUpdateDoctor() {
        return new UpdateDoctor();
    }

    /**
     * Create an instance of {@link GetFamilyResponse }
     * 
     */
    public GetFamilyResponse createGetFamilyResponse() {
        return new GetFamilyResponse();
    }

    /**
     * Create an instance of {@link GetVitalSignsResponse }
     * 
     */
    public GetVitalSignsResponse createGetVitalSignsResponse() {
        return new GetVitalSignsResponse();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link CreateMeasureResponse }
     * 
     */
    public CreateMeasureResponse createCreateMeasureResponse() {
        return new CreateMeasureResponse();
    }

    /**
     * Create an instance of {@link GetPersonByDoctor }
     * 
     */
    public GetPersonByDoctor createGetPersonByDoctor() {
        return new GetPersonByDoctor();
    }

    /**
     * Create an instance of {@link UpdateDoctorResponse }
     * 
     */
    public UpdateDoctorResponse createUpdateDoctorResponse() {
        return new UpdateDoctorResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link GetVitalSigns }
     * 
     */
    public GetVitalSigns createGetVitalSigns() {
        return new GetVitalSigns();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonByDoctorResponse }
     * 
     */
    public GetPersonByDoctorResponse createGetPersonByDoctorResponse() {
        return new GetPersonByDoctorResponse();
    }

    /**
     * Create an instance of {@link ListMeasureWrapper }
     * 
     */
    public ListMeasureWrapper createListMeasureWrapper() {
        return new ListMeasureWrapper();
    }

    /**
     * Create an instance of {@link CreateDoctorResponse }
     * 
     */
    public CreateDoctorResponse createCreateDoctorResponse() {
        return new CreateDoctorResponse();
    }

    /**
     * Create an instance of {@link DeleteDoctor }
     * 
     */
    public DeleteDoctor createDeleteDoctor() {
        return new DeleteDoctor();
    }

    /**
     * Create an instance of {@link ListPersonWrapper }
     * 
     */
    public ListPersonWrapper createListPersonWrapper() {
        return new ListPersonWrapper();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ListTargetWrapper }
     * 
     */
    public ListTargetWrapper createListTargetWrapper() {
        return new ListTargetWrapper();
    }

    /**
     * Create an instance of {@link CreateReminderResponse }
     * 
     */
    public CreateReminderResponse createCreateReminderResponse() {
        return new CreateReminderResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link GetReminderResponse }
     * 
     */
    public GetReminderResponse createGetReminderResponse() {
        return new GetReminderResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link GetFamily }
     * 
     */
    public GetFamily createGetFamily() {
        return new GetFamily();
    }

    /**
     * Create an instance of {@link GetMeasureDefinition }
     * 
     */
    public GetMeasureDefinition createGetMeasureDefinition() {
        return new GetMeasureDefinition();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link GetTargetList }
     * 
     */
    public GetTargetList createGetTargetList() {
        return new GetTargetList();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     * 
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Reminder }
     * 
     */
    public Reminder createReminder() {
        return new Reminder();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
    }

    /**
     * Create an instance of {@link Doctor }
     * 
     */
    public Doctor createDoctor() {
        return new Doctor();
    }

    /**
     * Create an instance of {@link Family }
     * 
     */
    public Family createFamily() {
        return new Family();
    }

    /**
     * Create an instance of {@link Person.Measurements }
     * 
     */
    public Person.Measurements createPersonMeasurements() {
        return new Person.Measurements();
    }

    /**
     * Create an instance of {@link Person.Targets }
     * 
     */
    public Person.Targets createPersonTargets() {
        return new Person.Targets();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createMeasure")
    public JAXBElement<CreateMeasure> createCreateMeasure(CreateMeasure value) {
        return new JAXBElement<CreateMeasure>(_CreateMeasure_QNAME, CreateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteDoctorResponse")
    public JAXBElement<DeleteDoctorResponse> createDeleteDoctorResponse(DeleteDoctorResponse value) {
        return new JAXBElement<DeleteDoctorResponse>(_DeleteDoctorResponse_QNAME, DeleteDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getDoctor")
    public JAXBElement<GetDoctor> createGetDoctor(GetDoctor value) {
        return new JAXBElement<GetDoctor>(_GetDoctor_QNAME, GetDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReminderWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "Reminders")
    public JAXBElement<ListReminderWrapper> createReminders(ListReminderWrapper value) {
        return new JAXBElement<ListReminderWrapper>(_Reminders_QNAME, ListReminderWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getMeasure")
    public JAXBElement<GetMeasure> createGetMeasure(GetMeasure value) {
        return new JAXBElement<GetMeasure>(_GetMeasure_QNAME, GetMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getTarget")
    public JAXBElement<GetTarget> createGetTarget(GetTarget value) {
        return new JAXBElement<GetTarget>(_GetTarget_QNAME, GetTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createDoctor")
    public JAXBElement<CreateDoctor> createCreateDoctor(CreateDoctor value) {
        return new JAXBElement<CreateDoctor>(_CreateDoctor_QNAME, CreateDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createTarget")
    public JAXBElement<CreateTarget> createCreateTarget(CreateTarget value) {
        return new JAXBElement<CreateTarget>(_CreateTarget_QNAME, CreateTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getReminder")
    public JAXBElement<GetReminder> createGetReminder(GetReminder value) {
        return new JAXBElement<GetReminder>(_GetReminder_QNAME, GetReminder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createReminder")
    public JAXBElement<CreateReminder> createCreateReminder(CreateReminder value) {
        return new JAXBElement<CreateReminder>(_CreateReminder_QNAME, CreateReminder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteReminder")
    public JAXBElement<DeleteReminder> createDeleteReminder(DeleteReminder value) {
        return new JAXBElement<DeleteReminder>(_DeleteReminder_QNAME, DeleteReminder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getMeasureResponse")
    public JAXBElement<GetMeasureResponse> createGetMeasureResponse(GetMeasureResponse value) {
        return new JAXBElement<GetMeasureResponse>(_GetMeasureResponse_QNAME, GetMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTargetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateTargetResponse")
    public JAXBElement<UpdateTargetResponse> createUpdateTargetResponse(UpdateTargetResponse value) {
        return new JAXBElement<UpdateTargetResponse>(_UpdateTargetResponse_QNAME, UpdateTargetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTargetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getTargetResponse")
    public JAXBElement<GetTargetResponse> createGetTargetResponse(GetTargetResponse value) {
        return new JAXBElement<GetTargetResponse>(_GetTargetResponse_QNAME, GetTargetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getCurrentHealth")
    public JAXBElement<GetCurrentHealth> createGetCurrentHealth(GetCurrentHealth value) {
        return new JAXBElement<GetCurrentHealth>(_GetCurrentHealth_QNAME, GetCurrentHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getDoctorResponse")
    public JAXBElement<GetDoctorResponse> createGetDoctorResponse(GetDoctorResponse value) {
        return new JAXBElement<GetDoctorResponse>(_GetDoctorResponse_QNAME, GetDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureDefinitionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getMeasureDefinitionResponse")
    public JAXBElement<GetMeasureDefinitionResponse> createGetMeasureDefinitionResponse(GetMeasureDefinitionResponse value) {
        return new JAXBElement<GetMeasureDefinitionResponse>(_GetMeasureDefinitionResponse_QNAME, GetMeasureDefinitionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTargetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteTargetResponse")
    public JAXBElement<DeleteTargetResponse> createDeleteTargetResponse(DeleteTargetResponse value) {
        return new JAXBElement<DeleteTargetResponse>(_DeleteTargetResponse_QNAME, DeleteTargetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateTarget")
    public JAXBElement<UpdateTarget> createUpdateTarget(UpdateTarget value) {
        return new JAXBElement<UpdateTarget>(_UpdateTarget_QNAME, UpdateTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentHealthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getCurrentHealthResponse")
    public JAXBElement<GetCurrentHealthResponse> createGetCurrentHealthResponse(GetCurrentHealthResponse value) {
        return new JAXBElement<GetCurrentHealthResponse>(_GetCurrentHealthResponse_QNAME, GetCurrentHealthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTargetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createTargetResponse")
    public JAXBElement<CreateTargetResponse> createCreateTargetResponse(CreateTargetResponse value) {
        return new JAXBElement<CreateTargetResponse>(_CreateTargetResponse_QNAME, CreateTargetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateReminder")
    public JAXBElement<UpdateReminder> createUpdateReminder(UpdateReminder value) {
        return new JAXBElement<UpdateReminder>(_UpdateReminder_QNAME, UpdateReminder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateReminderResponse")
    public JAXBElement<UpdateReminderResponse> createUpdateReminderResponse(UpdateReminderResponse value) {
        return new JAXBElement<UpdateReminderResponse>(_UpdateReminderResponse_QNAME, UpdateReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTargetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getTargetListResponse")
    public JAXBElement<GetTargetListResponse> createGetTargetListResponse(GetTargetListResponse value) {
        return new JAXBElement<GetTargetListResponse>(_GetTargetListResponse_QNAME, GetTargetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMeasureDefinitionWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "measureTypes")
    public JAXBElement<ListMeasureDefinitionWrapper> createMeasureTypes(ListMeasureDefinitionWrapper value) {
        return new JAXBElement<ListMeasureDefinitionWrapper>(_MeasureTypes_QNAME, ListMeasureDefinitionWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateDoctorResponse")
    public JAXBElement<UpdateDoctorResponse> createUpdateDoctorResponse(UpdateDoctorResponse value) {
        return new JAXBElement<UpdateDoctorResponse>(_UpdateDoctorResponse_QNAME, UpdateDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getPersonByDoctor")
    public JAXBElement<GetPersonByDoctor> createGetPersonByDoctor(GetPersonByDoctor value) {
        return new JAXBElement<GetPersonByDoctor>(_GetPersonByDoctor_QNAME, GetPersonByDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVitalSigns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getVitalSigns")
    public JAXBElement<GetVitalSigns> createGetVitalSigns(GetVitalSigns value) {
        return new JAXBElement<GetVitalSigns>(_GetVitalSigns_QNAME, GetVitalSigns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createMeasureResponse")
    public JAXBElement<CreateMeasureResponse> createCreateMeasureResponse(CreateMeasureResponse value) {
        return new JAXBElement<CreateMeasureResponse>(_CreateMeasureResponse_QNAME, CreateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteReminderResponse")
    public JAXBElement<DeleteReminderResponse> createDeleteReminderResponse(DeleteReminderResponse value) {
        return new JAXBElement<DeleteReminderResponse>(_DeleteReminderResponse_QNAME, DeleteReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteTarget")
    public JAXBElement<DeleteTarget> createDeleteTarget(DeleteTarget value) {
        return new JAXBElement<DeleteTarget>(_DeleteTarget_QNAME, DeleteTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateDoctor")
    public JAXBElement<UpdateDoctor> createUpdateDoctor(UpdateDoctor value) {
        return new JAXBElement<UpdateDoctor>(_UpdateDoctor_QNAME, UpdateDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVitalSignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getVitalSignsResponse")
    public JAXBElement<GetVitalSignsResponse> createGetVitalSignsResponse(GetVitalSignsResponse value) {
        return new JAXBElement<GetVitalSignsResponse>(_GetVitalSignsResponse_QNAME, GetVitalSignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFamilyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getFamilyResponse")
    public JAXBElement<GetFamilyResponse> createGetFamilyResponse(GetFamilyResponse value) {
        return new JAXBElement<GetFamilyResponse>(_GetFamilyResponse_QNAME, GetFamilyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFamily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getFamily")
    public JAXBElement<GetFamily> createGetFamily(GetFamily value) {
        return new JAXBElement<GetFamily>(_GetFamily_QNAME, GetFamily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getMeasureDefinition")
    public JAXBElement<GetMeasureDefinition> createGetMeasureDefinition(GetMeasureDefinition value) {
        return new JAXBElement<GetMeasureDefinition>(_GetMeasureDefinition_QNAME, GetMeasureDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getReminderResponse")
    public JAXBElement<GetReminderResponse> createGetReminderResponse(GetReminderResponse value) {
        return new JAXBElement<GetReminderResponse>(_GetReminderResponse_QNAME, GetReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTargetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getTargetList")
    public JAXBElement<GetTargetList> createGetTargetList(GetTargetList value) {
        return new JAXBElement<GetTargetList>(_GetTargetList_QNAME, GetTargetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMeasureWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "Measurements")
    public JAXBElement<ListMeasureWrapper> createMeasurements(ListMeasureWrapper value) {
        return new JAXBElement<ListMeasureWrapper>(_Measurements_QNAME, ListMeasureWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createDoctorResponse")
    public JAXBElement<CreateDoctorResponse> createCreateDoctorResponse(CreateDoctorResponse value) {
        return new JAXBElement<CreateDoctorResponse>(_CreateDoctorResponse_QNAME, CreateDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDoctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "deleteDoctor")
    public JAXBElement<DeleteDoctor> createDeleteDoctor(DeleteDoctor value) {
        return new JAXBElement<DeleteDoctor>(_DeleteDoctor_QNAME, DeleteDoctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByDoctorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "getPersonByDoctorResponse")
    public JAXBElement<GetPersonByDoctorResponse> createGetPersonByDoctorResponse(GetPersonByDoctorResponse value) {
        return new JAXBElement<GetPersonByDoctorResponse>(_GetPersonByDoctorResponse_QNAME, GetPersonByDoctorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createReminderResponse")
    public JAXBElement<CreateReminderResponse> createCreateReminderResponse(CreateReminderResponse value) {
        return new JAXBElement<CreateReminderResponse>(_CreateReminderResponse_QNAME, CreateReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersonWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "People")
    public JAXBElement<ListPersonWrapper> createPeople(ListPersonWrapper value) {
        return new JAXBElement<ListPersonWrapper>(_People_QNAME, ListPersonWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTargetWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.finalproject.introsde/", name = "Targets")
    public JAXBElement<ListTargetWrapper> createTargets(ListTargetWrapper value) {
        return new JAXBElement<ListTargetWrapper>(_Targets_QNAME, ListTargetWrapper.class, null, value);
    }

}
