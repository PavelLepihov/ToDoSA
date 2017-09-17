package com.example.falcon_ab.todosa.fragment;


import android.app.Fragment;
import android.support.v7.widget.RecyclerView;

import com.example.falcon_ab.todosa.adapter.CurrentTaskAdapter;
import com.example.falcon_ab.todosa.adapter.TaskAdapter;
import com.example.falcon_ab.todosa.model.ModelTask;

public abstract class TaskFragment extends Fragment {
    protected RecyclerView recyclerView;
    protected RecyclerView.LayoutManager layoutManager;
    protected TaskAdapter adapter;

    public void addTask(ModelTask newTask) {
        int position = -1;
        for (int i = 0; i < adapter.getItemCount(); i++) {
            if (adapter.getItem(i).isTask()) {
                ModelTask task = (ModelTask) adapter.getItem(i);
                if (newTask.getDate() < task.getDate()) {
                    position = i;
                    break;
                }
            }
        }

        if (position != -1) {
            adapter.addItem(position, newTask);
        } else {
            adapter.addItem(newTask);
        }
    }

    public abstract void moveTask(ModelTask task);

}
