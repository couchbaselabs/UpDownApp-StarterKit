package com.couchbase.updownapp;

import rx.Observable;

import java.util.Date;

public class Presentation {

    public String getKey() {
        return null;
    }

    private void setKey(String key) {
    }

    public void setTitle(String title) {
    }

    public void setCreatedAt(Date createdAt) {
    }

    public void setUpVotes(int upVotes) {
    }

    public void setDownVotes(int downVotes) {
    }

    public void setPersisted(boolean persisted) {
    }

    public String getTitle() {
        return null;
    }

    public Date getCreatedAt() {
        return null;
    }

    public int getUpVotes() {
        return 0;
    }

    public int getDownVotes() {
        return 0;
    }

    /*
     * This method uses Lambdas, available starting Java 8. If you are note familiar with Lambdas,
     * take a look at the following line of code:
     *
     *         return op.map(jd -> fromJsonDocument(jd));
     *
     * It would look like this without using Lambdas:
     *
     *        return op.map(new Func1<JsonDocument, Presentation>() {
     *           @Override
     *           public Presentation call(JsonDocument jsonDocument) {
     *               return fromJsonDocument(jsonDocument);
     *          }
     *       });
     *
     * For more information about Lambdas, please follow this link:
     *  http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
     *
     */
    public Observable<Presentation> save() {
      return null;
    }

    public static Observable<Presentation> find(String key) {
        return null;
    }


    /*
     * This relies on a view
     * Design document: presentations
     * View: all
     *
     * map:
     * function(doc, meta) {
     *   if (doc.type == "presentation") {
     *     emit(dateToArray(doc.createdAt), null)
     *   }
     * }
     */
    public static Observable<Presentation> findAll() {
      return null;
    }
}
