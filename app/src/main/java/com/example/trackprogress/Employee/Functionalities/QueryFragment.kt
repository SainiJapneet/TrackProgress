package com.example.trackprogress.Employee.Functionalities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.example.trackprogress.Database.AppDatabase
import com.example.trackprogress.Database.RaiseQuery
import com.example.trackprogress.Database.Status
import com.example.trackprogress.Employee.Adapters.QueryAdapter
import com.example.trackprogress.R
import kotlinx.coroutines.launch

class QueryFragment : Fragment() {

    lateinit var edtQuery: EditText
    lateinit var btnSubmitQuery: Button
    lateinit var txtQueryTitle: TextView
    lateinit var lstQueries: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_query, container, false)
        edtQuery = view.findViewById(R.id.edtQuery)
        btnSubmitQuery = view.findViewById(R.id.btnSubmitQuery)
        txtQueryTitle = view.findViewById(R.id.txtQueriesTitle)
        lstQueries = view.findViewById(R.id.lstQueries)

        val id = arguments?.getLong("ID")!!
        val raiseQueryDAO = AppDatabase.getInstance(requireContext()).raiseQueryDao()

        btnSubmitQuery.setOnClickListener {
            if(edtQuery.text.toString() != null){
                val query = edtQuery.text.toString()!!
                lifecycleScope.launch {
                    raiseQueryDAO.insert(RaiseQuery(0,id, query,"",Status.PENDING))
                }
            }else{
                edtQuery.setError("Fill this field")
            }
        }

        raiseQueryDAO.displayQuery(id).observe(viewLifecycleOwner){
            val adapter = QueryAdapter(requireContext(),R.layout.custom_query_view,it)
            lstQueries.adapter = adapter
        }

        return view
    }

}