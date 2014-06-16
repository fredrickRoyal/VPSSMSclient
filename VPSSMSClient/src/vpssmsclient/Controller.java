/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vpssmsclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import vpssmsserver.*;

/**
 *
 * @author Royal
 */
public class Controller {

    String host;
    int port;
    public static final String VPSSMSServer = "ServerStub";
    public static ArrayList<Student> studentsList;
    Registry registry;
    ServerStub remoteObject;

    public Controller() {
        initializeSettings();
        if (remoteObject == null) {
            System.out.println("Connection terminated");
        }
        if (remoteConnectionInitiated()) {
            System.out.println("Remote Object Ready for use");
        }

    }

    public final boolean remoteConnectionInitiated() {
        try {
            registry = LocateRegistry.getRegistry(host, port);
            remoteObject = (ServerStub) registry.lookup(VPSSMSServer);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public String generateId() {
        String id = null;
        try {
            id = remoteObject.generateId();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

    public boolean registerNewStudent(Student student) {
        boolean registered = false;
        try {
            registered = remoteObject.registerNewStudent(student);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registered;
    }

    public boolean updateStudent(Student student) {
        try {
            return remoteObject.updateStudent(student);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\nERROR from updateStudent Controller");
        }
        return false;
    }

    public boolean registerNewParent(Parent parent) {
        boolean registered = false;
        try {
            registered = remoteObject.registerParent(parent);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registered;
    }

    public boolean updateParent(Parent parent) {
        try {
            return remoteObject.updateParent(parent);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\nERROR from updateParent Method");
        }
        return false;
    }

    public boolean registerNewGuardian(Guardian guardian) {
        boolean registered = false;
        try {
            registered = remoteObject.registerGuardian(guardian);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registered;
    }

    public boolean updateGuardian(Guardian guardian) {
        try {
            return remoteObject.updateGuardian(guardian);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean registerSchoolAttended(SchoolAttended school) {
        boolean registered = false;
        try {
            registered = remoteObject.registerSchoolAttended(school);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registered;
    }

    public boolean createStudentClass(StudentClass studentClass) {
        boolean created = false;
        try {
            created = remoteObject.createStudentClass(studentClass);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return created;
    }

    public boolean createClassStream(ClassStream stream) {
        boolean created = false;
        try {
            created = remoteObject.createClassStream(stream);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return created;
    }

    public boolean registerClassStream(ClassStreamRegister register) {
        boolean registered = false;
        try {
            registered = remoteObject.registerClassStream(register);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registered;
    }

    public boolean registerOldStudent(StudentRegister register) {
        boolean registered = false;
        try {
            registered = remoteObject.registerOldStudent(register);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return registered;
    }

    public boolean createSubject(Subject subject) {
        boolean created = false;
        try {
            created = remoteObject.createSubject(subject);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return created;
    }

    public boolean createSubjectRegister(SubjectRegister register) {
        boolean created = false;
        try {
            created = remoteObject.createSubjectRegister(register);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return created;
    }

    public boolean addSubjectToSubjectRegister(SubjectRegistered subjectRegistered) {
        boolean added = false;
        try {
            added = remoteObject.addSubjectToSubjectRegister(subjectRegistered);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return added;
    }

    public boolean registerClassSubjects(ClassSubjectRegister register) {
        boolean added = false;
        try {
            added = remoteObject.registerClassSubjects(register);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return added;
    }

    public boolean createPaper(Paper paper) {
        boolean created = false;
        try {
            created = remoteObject.createPaper(paper);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return created;
    }

    public boolean registerSubjectPaper(SubjectPaperRegister register) {
        boolean added = false;
        try {
            added = remoteObject.registerSubjectPaper(register);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return added;
    }

    public boolean recordStudentResults(StudentResult result) {
        boolean recorded = false;
        try {;
            recorded = remoteObject.recordStudentResults(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return recorded;
    }

    public ArrayList<Paper> getPaperList() {
        ArrayList<Paper> list = new ArrayList<Paper>();
        try {
            list = remoteObject.getPaperList();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public ArrayList<SubjectRegister> getSubjectRegisterList() {
        ArrayList<SubjectRegister> list = new ArrayList<SubjectRegister>();
        try {
            list = remoteObject.getSubjectRegisterList();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public ArrayList<Subject> getSubjectList() {
        ArrayList<Subject> list = new ArrayList<Subject>();
        try {
            list = remoteObject.getSubjectList();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public ArrayList<StudentClass> getStudentClassList() {
        ArrayList<StudentClass> list = new ArrayList<StudentClass>();
        try {
            list = remoteObject.getStudentClassList();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public ArrayList<ClassStream> getClassStreamList() {
        ArrayList<ClassStream> list = new ArrayList<ClassStream>();
        try {
            list = remoteObject.getClassStreamList();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public TableModel studentRegisterTableModel() {
        TableModel tableModel = null;
        ArrayList<StudentRegister> list = new ArrayList<StudentRegister>();
        String[] columnNames = {"Registration Id", "Student", "Class", "Stream", "Term", "Academic Year", "Status"};
        String[][] studentRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.studentClassList();
            //studentsList = list;
            if (list == null) {
                rowNumber = 12;
                studentRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                studentRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<StudentRegister>() {

                    public int compare(StudentRegister s1, StudentRegister s2) {
                        return s1.getStudentId().compareToIgnoreCase(s2.getStudentId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    studentRecord[i][0] = list.get(i).getRegisterId();
                    studentRecord[i][1] = list.get(i).getStudentId();
                    studentRecord[i][2] = list.get(i).getClassId();
                    studentRecord[i][3] = list.get(i).getStreamId();
                    studentRecord[i][4] = list.get(i).getAcademicTerm();
                    studentRecord[i][5] = list.get(i).getAcademicYear();
                    studentRecord[i][6] = list.get(i).getStatus();
                }
            }
            tableModel = new DefaultTableModel(studentRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel searchStudentTableModel(String criteria, String searchText) {
        TableModel tableModel = null;
        ArrayList<Student> list = new ArrayList<Student>();
        String[] columnNames = {"No.", "Student Id", "First Name", "Last Name", "Other Name"};
        String[][] studentRecord = null;

        int rowNumber = 0;
        try {
            list = remoteObject.searchStudent(criteria, searchText);
            studentsList = list;
            if (list == null) {
                rowNumber = 12;
                studentRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                studentRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<Student>() {

                    public int compare(Student s1, Student s2) {
                        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    studentRecord[i][0] = Integer.toString(i + 1);
                    studentRecord[i][1] = list.get(i).getStudentId();
                    studentRecord[i][2] = list.get(i).getFirstName();
                    studentRecord[i][3] = list.get(i).getLastName();
                    studentRecord[i][4] = list.get(i).getOtherName();

                }
            }
            tableModel = new DefaultTableModel(studentRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel studentTableModel() {
        TableModel tableModel = null;
        ArrayList<Student> list = new ArrayList<Student>();
        String[] columnNames = {"StudentId", "First Name", "Last Name", "Other Name", "Gender", "Birth Place", "DOB", "District", "Residence", "Nationality", "Religion", "Disability", "AdmissionDate", "Contact", "Status",};
        String[][] studentRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getStudentList();
            //studentsList = list;
            if (list == null) {
                rowNumber = 12;
                studentRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                studentRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<Student>() {

                    public int compare(Student s1, Student s2) {
                        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    studentRecord[i][0] = list.get(i).getStudentId();
                    studentRecord[i][1] = list.get(i).getFirstName();
                    studentRecord[i][2] = list.get(i).getLastName();
                    studentRecord[i][3] = list.get(i).getOtherName();
                    studentRecord[i][4] = list.get(i).getGender();
                    studentRecord[i][5] = list.get(i).getBirthPlace();
                    studentRecord[i][6] = list.get(i).getDOB();
                    studentRecord[i][7] = list.get(i).getDistrict();
                    studentRecord[i][8] = list.get(i).getResidence();
                    studentRecord[i][9] = list.get(i).getNationality();
                    studentRecord[i][10] = list.get(i).getReligion();
                    studentRecord[i][11] = list.get(i).getDisability();
                    studentRecord[i][12] = list.get(i).getAdmissionDate();
                    studentRecord[i][13] = list.get(i).getContact();
                    studentRecord[i][14] = list.get(i).getStatus();


                }
            }
            tableModel = new DefaultTableModel(studentRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel parentTableModel() {
        TableModel tableModel = null;
        ArrayList<Parent> list = new ArrayList<Parent>();
        String[] columnNames = {"ParentId", "Student Name", "First Name", "Last Name", "Other Name", "Occupation", "Residence", "Relationship", "Contact", "Status"};
        String[][] parentRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getParentList();
            //studentsList = list;
            if (list == null) {
                rowNumber = 12;
                parentRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                parentRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<Parent>() {

                    public int compare(Parent s1, Parent s2) {
                        return s1.getStudentId().compareToIgnoreCase(s2.getStudentId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    parentRecord[i][0] = list.get(i).getParentId();
                    parentRecord[i][1] = list.get(i).getStudentId();
                    parentRecord[i][2] = list.get(i).getFirstName();
                    parentRecord[i][3] = list.get(i).getLastName();
                    parentRecord[i][4] = list.get(i).getOtherName();
                    parentRecord[i][5] = list.get(i).getOccupation();
                    parentRecord[i][6] = list.get(i).getResidence();
                    parentRecord[i][7] = list.get(i).getRelationship();
                    parentRecord[i][8] = list.get(i).getContact();
                    parentRecord[i][9] = list.get(i).getStatus();
                }
            }
            tableModel = new DefaultTableModel(parentRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel GuardianTableModel() {
        TableModel tableModel = null;
        ArrayList<Guardian> list = new ArrayList<Guardian>();
        String[] columnNames = {"Id", "Student Name", "First Name", "Last Name", "Other Name", "Occupation", "Residence", "Gender", "Contact", "Status"};
        String[][] guardianRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getGuardianList();
            //studentsList = list;
            if (list == null) {
                rowNumber = 12;
                guardianRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                guardianRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<Guardian>() {

                    public int compare(Guardian s1, Guardian s2) {
                        return s1.getStudentId().compareToIgnoreCase(s2.getStudentId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    guardianRecord[i][0] = list.get(i).getGuardianId();
                    guardianRecord[i][1] = list.get(i).getStudentId();
                    guardianRecord[i][2] = list.get(i).getFirstName();
                    guardianRecord[i][3] = list.get(i).getLastName();
                    guardianRecord[i][4] = list.get(i).getOtherName();
                    guardianRecord[i][5] = list.get(i).getOccupation();
                    guardianRecord[i][6] = list.get(i).getResidence();
                    guardianRecord[i][7] = list.get(i).getGender();
                    guardianRecord[i][8] = list.get(i).getContact();
                    guardianRecord[i][9] = list.get(i).getStatus();
                }
            }
            tableModel = new DefaultTableModel(guardianRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;
    }

    public TableModel SchoolAttendedTableModel() {
        TableModel tableModel = null;
        ArrayList<SchoolAttended> list = new ArrayList<SchoolAttended>();
        String[] columnNames = {"Id", "Student", "Name", "Duration", "Qualification Attained", "Reason For Change", "Status"};
        String[][] schoolAttendedRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getSchoolAttendedList();
            //studentsList = list;
            if (list == null) {
                rowNumber = 12;
                schoolAttendedRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                schoolAttendedRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<SchoolAttended>() {

                    public int compare(SchoolAttended s1, SchoolAttended s2) {
                        return s1.getStudentId().compareToIgnoreCase(s2.getStudentId());
                    }
                });

                for (int i = 0; i < list.size(); i++) {
                    schoolAttendedRecord[i][0] = list.get(i).getSchoolId();
                    schoolAttendedRecord[i][1] = list.get(i).getStudentId();
                    schoolAttendedRecord[i][2] = list.get(i).getName();
                    schoolAttendedRecord[i][3] = Integer.toString(list.get(i).getDuration()) + "  " + list.get(i).getUOM();
                    schoolAttendedRecord[i][4] = list.get(i).getQualification();
                    schoolAttendedRecord[i][5] = list.get(i).getReasonForChange();
                    schoolAttendedRecord[i][6] = list.get(i).getStatus();
                }
            }
            tableModel = new DefaultTableModel(schoolAttendedRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;
    }

    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public TableModel classTableModel() {
        TableModel tableModel = null;
        ArrayList<StudentClass> list = new ArrayList<StudentClass>();
        String[] columnNames = {"Class Id", "Name", "Status", "Creation Date"};
        String[][] classRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getClassList();
            if (list == null) {
                rowNumber = 12;
                classRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                classRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<StudentClass>() {

                    public int compare(StudentClass s1, StudentClass s2) {
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    classRecord[i][0] = list.get(i).getClassId();
                    classRecord[i][1] = list.get(i).getName();
                    classRecord[i][2] = list.get(i).getStatus();
                    classRecord[i][3] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(classRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel streamTableModel() {
        TableModel tableModel = null;
        ArrayList<ClassStream> list = new ArrayList<ClassStream>();
        String[] columnNames = {"Stream Id", "Name", "Status", "Creation Date"};
        String[][] streamRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getStreamList();
            if (list == null) {
                rowNumber = 12;
                streamRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                streamRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<ClassStream>() {

                    public int compare(ClassStream s1, ClassStream s2) {
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    streamRecord[i][0] = list.get(i).getStreamId();
                    streamRecord[i][1] = list.get(i).getName();
                    streamRecord[i][2] = list.get(i).getStatus();
                    streamRecord[i][3] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(streamRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel classStreamRegisteredTableModel() {
        TableModel tableModel = null;
        ArrayList<ClassStreamRegister> list = new ArrayList<ClassStreamRegister>();
        String[] columnNames = {"Id", "Class", "Stream", "Term", "Academic Year", "Status", "Registration Date"};
        String[][] registerRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.classStreamRegisteredList();
            if (list == null) {
                rowNumber = 12;
                registerRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                registerRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<ClassStreamRegister>() {

                    public int compare(ClassStreamRegister s1, ClassStreamRegister s2) {
                        return s1.getClassId().compareToIgnoreCase(s2.getClassId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    registerRecord[i][0] = list.get(i).getRegisterId();
                    registerRecord[i][1] = list.get(i).getClassId();
                    registerRecord[i][2] = list.get(i).getStreamId();
                    registerRecord[i][3] = list.get(i).getTerm();
                    registerRecord[i][4] = list.get(i).getYear();
                    registerRecord[i][5] = list.get(i).getStatus();
                    registerRecord[i][6] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(registerRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel subjectTableModel() {
        TableModel tableModel = null;
        ArrayList<Subject> list = new ArrayList<Subject>();
        String[] columnNames = {"Id", "Name", "Status", "Creation Date"};
        String[][] subjectRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getSubjectList();
            if (list == null) {
                rowNumber = 12;
                subjectRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                subjectRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<Subject>() {

                    public int compare(Subject s1, Subject s2) {
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    subjectRecord[i][0] = list.get(i).getSubjectId();
                    subjectRecord[i][1] = list.get(i).getName();
                    subjectRecord[i][2] = list.get(i).getStatus();
                    subjectRecord[i][3] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(subjectRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel subjectRegisterTableModel() {
        TableModel tableModel = null;
        ArrayList<SubjectRegister> list = new ArrayList<SubjectRegister>();
        String[] columnNames = {"Id", "Name", "Status", "Creation Date"};
        String[][] subjectRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getSubjectRegisterList();
            if (list == null) {
                rowNumber = 12;
                subjectRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                subjectRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<SubjectRegister>() {

                    public int compare(SubjectRegister s1, SubjectRegister s2) {
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    subjectRecord[i][0] = list.get(i).getRegisterId();
                    subjectRecord[i][1] = list.get(i).getName();
                    subjectRecord[i][2] = list.get(i).getStatus();
                    subjectRecord[i][3] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(subjectRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel subjectRegisteredTableModel() {
        TableModel tableModel = null;
        ArrayList<SubjectRegistered> list = new ArrayList<SubjectRegistered>();
        String[] columnNames = {"Id", "Subject Register", "Subject", "Status", "Creation Date"};
        String[][] subjectRecord = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getSubjectRegisteredList();
            if (list == null) {
                rowNumber = 12;
                subjectRecord = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                subjectRecord = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<SubjectRegistered>() {

                    public int compare(SubjectRegistered s1, SubjectRegistered s2) {
                        return s1.getRegisterId().compareToIgnoreCase(s2.getRegisterId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    subjectRecord[i][0] = list.get(i).getId();
                    subjectRecord[i][1] = list.get(i).getRegisterId();
                    subjectRecord[i][2] = list.get(i).getSubjectId();
                    subjectRecord[i][3] = list.get(i).getStatus();
                    subjectRecord[i][4] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(subjectRecord, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel classSubjectRegisterTableModel() {
        TableModel tableModel = null;
        ArrayList<ClassSubjectRegister> list = new ArrayList<ClassSubjectRegister>();
        String[] columnNames = {"Id", "Class", "Subject Register", "Term", "Academic Year"};
        String[][] record = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getClassSubjectRegisterList();
            if (list == null) {
                rowNumber = 12;
                record = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                record = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<ClassSubjectRegister>() {

                    public int compare(ClassSubjectRegister s1, ClassSubjectRegister s2) {
                        return s1.getClassId().compareToIgnoreCase(s2.getClassId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    record[i][0] = list.get(i).getId();
                    record[i][1] = list.get(i).getClassId();
                    record[i][2] = list.get(i).getRegisterId();
                    record[i][3] = list.get(i).getTerm();
                    record[i][4] = list.get(i).getAcademicYear();
                }
            }
            tableModel = new DefaultTableModel(record, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel paperTableModel() {
        TableModel tableModel = null;
        ArrayList<Paper> list = new ArrayList<Paper>();
        String[] columnNames = {"Id", "Name", "Code", "Status", "Creation Date"};
        String[][] record = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getPaperList();
            if (list == null) {
                rowNumber = 12;
                record = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                record = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<Paper>() {

                    public int compare(Paper s1, Paper s2) {
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    record[i][0] = list.get(i).getId();
                    record[i][1] = list.get(i).getName();
                    record[i][2] = list.get(i).getCode();
                    record[i][3] = list.get(i).getStatus();
                    record[i][4] = list.get(i).getDate();
                }
            }
            tableModel = new DefaultTableModel(record, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel subjectPaperRegisterTableModel() {
        TableModel tableModel = null;
        ArrayList<SubjectPaperRegister> list = new ArrayList<SubjectPaperRegister>();
        String[] columnNames = {"Id", "Subject", "Paper", "PaperCode", "Status", "Academic Year"};
        String[][] record = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getSubjectPaperRegisterist();
            if (list == null) {
                rowNumber = 12;
                record = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                record = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<SubjectPaperRegister>() {

                    public int compare(SubjectPaperRegister s1, SubjectPaperRegister s2) {
                        return s1.getSubjectId().compareToIgnoreCase(s2.getSubjectId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    record[i][0] = list.get(i).getId();
                    record[i][1] = list.get(i).getSubjectId();
                    record[i][2] = list.get(i).getPaperId();
                    record[i][3] = list.get(i).getPaperCode();
                    record[i][4] = list.get(i).getStatus();
                    record[i][5] = list.get(i).getAcademicYear();
                }
            }
            tableModel = new DefaultTableModel(record, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public TableModel studentResultTableModel() {
        TableModel tableModel = null;
        ArrayList<StudentResult> list = new ArrayList<StudentResult>();
        String[] columnNames = {"Id", "Student", "Subject", "Paper", "PaperCode", "Term", "Academic Year", "HolidayWork", "B.O.T", "Mid-Term", "E.O.T"};
        String[][] record = null;
        int rowNumber = 0;
        try {
            list = remoteObject.getStudentResult();
            if (list == null) {
                rowNumber = 12;
                record = new String[rowNumber][columnNames.length];

            } else {
                rowNumber = list.size() + 10;
                record = new String[rowNumber][columnNames.length];
                /*SORTING*/
                Collections.sort(list, new Comparator<StudentResult>() {

                    public int compare(StudentResult s1, StudentResult s2) {
                        return s1.getStudentId().compareToIgnoreCase(s2.getStudentId());
                    }
                });
                for (int i = 0; i < list.size(); i++) {
                    record[i][0] = list.get(i).getId();
                    record[i][1] = list.get(i).getStudentId();
                    record[i][2] = list.get(i).getSubjectId();
                    record[i][3] = list.get(i).getPaperName();
                    record[i][4] = list.get(i).getPaperId();
                    record[i][5] = list.get(i).getTerm();
                    record[i][6] = list.get(i).getAcademicYear();
                    if (list.get(i).getHolidayWork() == -1) {
                        record[i][7] = "";
                    } else {
                        record[i][7] = Integer.toString(list.get(i).getHolidayWork());
                    }
                    if (list.get(i).getBOT() == -1) {
                        record[i][8] = "";
                    } else {
                        record[i][8] = Integer.toString(list.get(i).getBOT());
                    }
                    if (list.get(i).getMidTerm() == -1) {
                        record[i][9] = "";
                    } else {
                        record[i][9] = Integer.toString(list.get(i).getMidTerm());
                    }
                    if (list.get(i).getEOT() == -1) {
                        record[i][10] = "";
                    } else {
                        record[i][10] = Integer.toString(list.get(i).getEOT());
                    }

                }
            }
            tableModel = new DefaultTableModel(record, columnNames) {

                @Override
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;

    }

    public boolean deleteRecord(String id, String tableName, String primaryKey) {
        boolean deleted = false;
        try {
            deleted = remoteObject.updateRecordStatus(id, tableName, primaryKey);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return deleted;
    }

    public byte[] getImageData(String id) {
        try {
            return remoteObject.getImageData(id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public String getStudentId(String Id, String tableName, String field) {
        try {
            return remoteObject.getStudentId(Id, tableName, field);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "ERROR from getStudentId");
        }
        return null;
    }

    public void setInitialFile(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                PrintWriter bw = new PrintWriter(fw);
                bw.println(1099);
                bw.append("localhost");
                bw.close();
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "ERROR from setInitialFile Function");
        }

    }

    public void setPortHost(String fileName) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader read = new BufferedReader(fileReader);
            while (true) {
                String line = read.readLine();
                if (line == null) {
                    break;
                } else {
                    list.add(line);
                }

            }
            port = Integer.parseInt(list.get(0));
            host = list.get(1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "ERROR from setPortHost function");
        }
    }

    public void createConfigurationFolder(String fileDirectory) {
        File makeDirectory = new File(fileDirectory);
        if (makeDirectory.mkdir()) {

            System.out.println("Folder .vpssmsConfig created");
        } else {
            System.out.println("Folder .vpssmsConfig already Exists");
        }

    }

    public final void initializeSettings() {
        try {

            File file = null;
            String fileDirectory = System.getProperty("user.home") + "\\.vpssmsConfig";
            String configurationFile = fileDirectory + "\\server.txt";
            /*create configuration directory if not exists*/
            createConfigurationFolder(fileDirectory);
            file = new File(configurationFile);
            // if file doesnt exists, then create it
            setInitialFile(file);
            setPortHost(configurationFile);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "ERROR from InitializeSettings");

        }

    }
}
