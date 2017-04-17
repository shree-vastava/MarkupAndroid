Welcome to the MarkupAndroid wiki!

So, this library is for highlighting or adding note to a particular text.

[Watch it in action here](https://www.youtube.com/watch?v=D20zPvYrUsI)

### How to add
Add this in the project level build.gradle:

                 repositories{
                      ....
                      maven { url 'https://jitpack.io' }
                 }
and this in the module's build.gradle:

                  compile 'com.github.shree-vastava:MarkupAndroid:v1.0'

### Highlights
If you want to add multiple Highlights in a page, create highlight objects (The model class is provided in the library), and keep adding the objects in a list.. Voila!! there you have all the highlights..


                HighlightModel model = new HighlightModel(); // creating a model object, model class from library.
                model.setStartIdx(textView.getSelectionStart());// start index of text you want to highlight
                model.setEndIdx(textView.getSelectionEnd());// end index of text you want to highlight
                model.setColor(Color.BLUE); // color of highlight

                highList.add(model); // Adding the object in a list for example : List<HighlightModel>

                MarkupAndorid markUp = new MarkupAndorid(); //creating an object of library class
                markUp.highlight(MainActivity.this,textView,highList); //calling the function to highlight


### Notes
If you want to add multiple Notesin a page, create Notes objects (The model class is provided in the library), and keep adding the objects in a list.. Voila!! there you have all the Notes..


                NotesModel model = new NotesModel(); //create object of notes model class
                model.setStartIdx(textView.getSelectionStart()); // setting start index
                model.setEndIdx(textView.getSelectionEnd()); //setting end index
                model.setNote("Aquaman Sucks!"); //setting text note thath you want to add

                notesList.add(model); //adding in a list

                MarkupAndorid markUp = new MarkupAndorid(); //create library class object
                markUp.addNote(MainActivity.this,textView,notesList); //calling method to add note

### Notes and Highlights both
                
                MarkupAndorid markUp = new MarkupAndorid();
                markUp.addAll(MainActivity.this,textView,notesList,highList); //notesList and highList are the lists of corresponding objects. exactly like in the above examples
