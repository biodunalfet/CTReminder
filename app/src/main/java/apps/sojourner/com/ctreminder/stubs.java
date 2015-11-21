package apps.sojourner.com.ctreminder;

/**
 * Created by Hamza Fetuga on 7/28/2015.
 */
public class stubs {


    //
    //SHOW TOAST FROM ANY FRAGMENT/ACTIVITY
    //
//        public void createToast(Context c, String msg)
//    {
//        Toast.makeText(c, msg,
//                Toast.LENGTH_LONG).show();
//    }

    //HTTP REQUEST USING HTTPURLCONNECTION
    //
//    public class Request extends AsyncTask<Void, Void, String> {
//        HttpURLConnection urlConnection;
//        BufferedReader reader = null;
//        String requestResponse;
//
//        @Override
//        protected void onPreExecute() {
//            //isLoading=true;
//            super.onPreExecute();
//        }
//
//        @Override
//        protected String doInBackground(Void... strings) {
//
//            try {
//
//                //String form_data_query= strings[0];
//                //Log.d("form_data_query",strings[0]);
//
//                Log.d("GetCat", "IN");
////                Uri.Builder builder = new Uri.Builder();
////                builder.scheme("http");
////                builder.authority("https://testwamsjs.azure-mobile.net")
////                        .appendPath("api")
////                        .appendPath("lemz_insert_restaurant");
////
////                URL url = new URL(builder.build().toString());
//
//                URL url = new URL("https://lemzmobile.azure-mobile.net/tables/lemz_merchants_food");
//
////                final String username = "hamza";
////                final String password = "hamza@lemzdelivery.com";
////                String channel = username + ":" + password;
//
//                try {
//                    urlConnection = (HttpURLConnection) url.openConnection();
//                    urlConnection.setRequestMethod("GET");
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
////                String basicAuth = "Basic " + Base64.encodeToString(channel.getBytes(), Base64.URL_SAFE | Base64.NO_WRAP);
////                Log.d("auth", basicAuth);
//
////                urlConnection.setUseCaches(false);
////                urlConnection.setDoInput(true);
////                urlConnection.setDoOutput(true);
////                urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
////                urlConnection.addRequestProperty("Authorization", basicAuth);
//                //urlConnection.connect();
//
//                //urlConnection.getOutputStream().write((form_data_query).getBytes());
//
//
//                int status = urlConnection.getResponseCode();
//                Log.d("status", urlConnection.getResponseMessage());
//                Log.d("url", urlConnection.getHeaderField(urlConnection.getContentLength()) + "");
//                Log.d("status", status + "");
//                InputStream inputStream;
//                if (status == HttpStatus.SC_OK) {
//
//                    // Read the input stream into a String
//                    inputStream = urlConnection.getInputStream();
//                } else if (status == HttpStatus.SC_NO_CONTENT) {
//                    inputStream = null;
//                } else {
//                    inputStream = urlConnection.getErrorStream();
//                }
//                StringBuffer buffer = new StringBuffer();
//                if (inputStream == null) {
//                    // Nothing to do.
//                    requestResponse = "";
//                    return requestResponse;
//                }
//
//                reader = new BufferedReader(new InputStreamReader(inputStream));
//
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    // Since it's JSON, adding a newline isn't necessary (it won't affect parsing)
//                    // But it does make debugging a *lot* easier if you print out the completed
//                    // buffer for debugging.
//                    buffer.append(line + "\n");
//                }
//
//                if (buffer.length() == 0) {
//                    // Stream was empty.  No point in parsing.
//                    return null;
//                }
//                requestResponse = buffer.toString();
//                Log.d("requestResponse", requestResponse);
//
//                return requestResponse;
//
//
//            } catch (IOException e) {
//                Log.e("SignInFragment", e.toString(), e);
//                // If the code didn't successfully get the weather data, there's no point in attemping
//                // to parse it.
//                return null;
//            } finally {
//                if (urlConnection != null) {
//                    urlConnection.disconnect();
//                }
//                if (reader != null) {
//                    try {
//                        reader.close();
//                    } catch (final IOException e) {
//                        Log.e("GetMerchant", "Error closing stream", e);
//                    }
//                }
//            }
//
//
//        }
//
//    }

    //
    //TO GENERATE UNIQUE ID FROM TIMESTAMP
    //
//    public class UniqueIdGeneratorWithTimeStamp {
//
//        public void ActionMethod() {
//            generateId();
//        }
//
//        public char RandomChar() {
//            Random r = new Random();
//            char c = (char) (r.nextInt(26) + 'a');
//            return c;
//        }
//
//        public String generateId() {
//            char f = RandomChar();
//            char l = RandomChar();
//            String timestamp = System.currentTimeMillis() + "";
//            return f + timestamp + l;
//        }
//
//    }

    //
    //TO LOAD PICTURES FROM URL USING PICASSO
    //
    //public class PicassoLoad {
    //    Picasso.with(context)
    //            .load(currItem.getImage_url().trim())
    //            .placeholder(R.drawable.img_placeholder)
    //    .error(R.drawable.err)
    //    .into(prod_img);
    //}

    //
    //CREATE ALERT DIALOGS
    //
//    public void createAlertDialogs{
//
//        android.support.v7.app.AlertDialog.Builder builder= new android.support.v7.app.AlertDialog.Builder(getActivity());
//        builder.setView(InflatedviewGoesHere).
//        setPositiveButton("DONE", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        })
//                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
//        final android.support.v7.app.AlertDialog alertDialog= builder.create();
//        alertDialog.show();
//
//        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //Do stuff, possibly set wantToCloseDialog to true then...
//
//
//            }
//        });
//
//    }

    //
    //CONVERT JSON STRING TO ARRAY LIST
    //
//    public ArrayList<item_a> convertToList(String jsonString)
//    {
//        ArrayList<item_a> arrayList;
//        Gson gson= new Gson();
//        Type type= new TypeToken<ArrayList<item_a>>(){}.getType();
//        arrayList= gson.fromJson(jsonString, type);
//        return arrayList;
//    }

    //
    //CONVERT ARRAY LIST TO GSON
    //
//    public String arrayListToJson(ArrayList OT)
//    {
//        Gson gson= new GsonBuilder().create();
//        return gson.toJsonTree(OT).getAsJsonArray().toString();
//    }

    //
    //INSERT MULTIPLE ITEMS INTO DB FOR WAMS
    //
//    function testLoad(){
//        //Write to my service log
//        console.info("Running 'PrePopulateTable' job.");
//
//
//        // The table we will be inserting into
//        var todoTable = tables.getTable('TodoItem');
//        // The number of records to insert at a time (to avoid blowing our connection limit)
//        var batchSize = 10;
//        // The number of records I want to generate dummy data for
//        var recordsToInsert = 1000;
//        // The number of records processed
//        var totalCount = 0;
//        // The number of insert failure
//        var errorCount = 0;
//
//
//        // Start inserting items!
//        insertItems();
//
//
//        // define the insertItems function
//        function insertItems() {
//
//            // local var shared with the insertComplete callback function.
//            // This is scoped to this function so if the function is called again
//            // it will be reset to 0
//            var batchCompletedCount = 0;
//
//
//
//            // insertComplete is called for each record inserted into the table
//            // called when the insert completes async. Also called by the errorHandler callback
//            var insertComplete = function() {
//                // increment the number of records we have completed the insert call for
//                batchCompletedCount++;
//                // increment the total number of records processed
//                totalCount++;
//                // if we have completed all of the records in this current batch
//                // or don't have any more records to process we either...
//                if(batchCompletedCount === batchSize || totalCount === recordsToInsert) {
//                    if(totalCount < recordsToInsert) {
//                        insertItems(); // kick off the next batch
//                    } else {
//                        // or we are done
//                        // report the status of the job to the log and don't do any more processing
//                        console.log("Job 'PrePopulateTable' complete. %d Records processed. There were %d errors.", totalCount, errorCount);
//                    }
//                }
//            };
//
//            // called if there was an error doing the insert
//            var errorHandler = function(err) {
//                // I want to track the number of errors for reporting,
//                // you may want to do something different here
//                errorCount++;
//                console.warn("Ignoring insert failure as part of batch.", err);
//                // call insertComplete simply to use the logic to track the batch count,
//                // total count and kick off the next batch if necessary.
//                // you may want to do something different!
//                insertComplete();
//            };
//            // insert some items!
//            for(var i = 0; i < batchSize; i++) {
//                // num is used to generate some unique dummy data
//                var num = totalCount + i;
//                // dummy data item to insert
//                var item = { text: "This is Item number: " + num };
//                //This table insert completes async so we have a success and error callback set of functions
//                // defined that will be called when the insert completes
//                todoTable.insert(item, {
//                        success: insertComplete,
//                        error: errorHandler
//                });
//            }
//
//
//        }
//    }

}
