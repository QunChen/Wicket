package com.mycompany.guestbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.util.value.ValueMap;

public final class CommentForm extends Form<ValueMap> {

	private  List<Comment> commentList;
	
	public CommentForm(final String id,List<Comment> list) {		
		super(id,new CompoundPropertyModel<ValueMap>(new ValueMap()));
		commentList=list;
		// TODO Auto-generated constructor stub
		
		setMarkupId("commentForm");
		
		add(new TextArea<String>("text").setType(String.class));
		
		add(new TextField<String>("comment").setType(String.class));
	}
	
	 @Override
     public final void onSubmit() {
         ValueMap values = getModelObject();

         // check if the honey pot is filled
         if (StringUtils.isNotBlank((String)values.get("comment"))) {
             error("Caught a spammer!!!");
             return;
         }
         // Construct a copy of the edited comment
         Comment comment = new Comment();

         // Set date of comment to add
         comment.setDate(new Date());
         comment.setText((String)values.get("text"));
         commentList.add(comment);

         // Clear out the text component
         values.put("text", "");
     }
 
}
