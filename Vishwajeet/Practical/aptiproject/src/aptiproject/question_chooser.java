package aptiproject;

import java.util.*;

class question_chooser {
    int que_id;
    @SuppressWarnings("rawtypes")
    Vector que;
    String subject;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    question_chooser(String subject) {
        this.subject = subject;
        que = new Vector();
//        que_id = (int) (Math.random() * 21);
//        que.add(que_id);
    }

    boolean checkId(int id) {
        boolean available = true;
        if (que.contains(id)) available = false;
        return available;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    Vector addQuestion() {
        while (true) {
            que_id = (int) (Math.random() * 21);
            if (que.size() == 20) break;
            if (checkId(que_id)) que.add(que_id);
        }
        return que;
    }

    void display() {
        Object[] arr = new Object[20];
        for (int i = 0; i < que.size(); i++) {
            System.out.print("  " + que.elementAt(i));
            arr[i] = que.elementAt(i);
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < que.size(); i++) {
            System.out.print("  " + arr[i]);
        }
    }
}
