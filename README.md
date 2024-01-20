
# List
This project is a `list` that can be filled with `anything`

## Compatibility
 
This is already standard, the program is made on `AndroidStudio` and it is not compatible with Apple

| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/800px-Android_robot.svg.png_48x48.png" alt="Edge" width="45px" height="50px" /></br>Android | <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Apple_logo_grey.svg/1724px-Apple_logo_grey.svg.png" alt="Edge" width="45px" height="50px" /></br>Apple |
:-------:|:-------:|
|    ✔️  |    ❌  |

![Gif](gif.gif) 


<h1 align="center">Important code moments</h1> 

```
private String readRawTextFile(Context context, int resId) {
        InputStream inpStr = context.getResources().openRawResource(resId);
        InputStreamReader inpRead = new InputStreamReader(inpStr);
        BufferedReader buffRead = new BufferedReader((inpRead));
        String line;
        StringBuilder bulder = new StringBuilder();

        try {
            while ((line = buffRead.readLine()) != null){
                bulder.append(line);
                bulder.append("<br>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bulder.toString();
    }
```

This function is needed in order to read the text and display it on the screen
