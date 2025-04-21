package com.library.bean;

import java.util.Date;

public class IssuedBook {
    private int issueId;
    private int bookId;
    private String userEmail;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;
    private double fine;
    private boolean reissueRequested;

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public boolean isReissueRequested() {
        return reissueRequested;
    }

    public void setReissueRequested(boolean reissueRequested) {
        this.reissueRequested = reissueRequested;
    }
}

