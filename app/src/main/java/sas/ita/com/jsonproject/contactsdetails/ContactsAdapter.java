package sas.ita.com.jsonproject.contactsdetails;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import sas.ita.com.jsonproject.R;

/**
 * Created by sasmob on 12/12/2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
    Context mcontext;
    ArrayList<ContactsPerson> ContactsPerson;


    public ContactsAdapter(Context mcontext, ArrayList<sas.ita.com.jsonproject.contactsdetails.ContactsPerson> contactsPerson) {
        this.mcontext = mcontext;
        ContactsPerson = contactsPerson;
    }

    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater Inflater=(LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=Inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    ContactsPerson person=ContactsPerson.get(position);
    holder.name.setText(person.getName());
    holder.email.setText(person.getEmail());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,email;
        public ViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
            email=(TextView)itemView.findViewById(R.id.email);
        }
    }
}
