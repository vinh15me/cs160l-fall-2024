package edu.sdsu.cs160l.university.lab5.application;

public class ScholarshipApplication implements UniversityApplication {

    @Override
    public void submitScore(Applicant s, float score) throws Exception {
        if(score < 3.20) {
            s.setAdmitted(false);
            throw new Exception("Score was not high enough.");
        }
        s.setApplicantScore(score);
    }

    public void submitDocuments(Applicant s, String documents) {
        s.setApplicantDocuments(documents);
    }

    public boolean checkStatus(Applicant applicant) {
        if(applicant.getApplicantDocuments() != null && applicant.getApplicantScore() >= 3.20) {
            return true;
        }
        return false;
    }
}

