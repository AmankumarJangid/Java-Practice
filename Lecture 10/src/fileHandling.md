# File Handling

## FileWriter **Class**

---
### Constructor 
- FileWriter(String fileName);
- FileWriter(File file); // file is another class to store the path of the file

### Common Methods
- `write(int c)` : writes a single character
- `write(char[] cbuf)` : writes an array of Characters
- `write(String str)` : write a string 
- `flush()` : Flushes the stream ensuring all data is written out
- // rights immediately in the file not storing it later write it later just put and save it 
- `close()` : Closes the stream , releasing any associated system resources

