#!/usr/bin/env groovy
 
def border(text, chr) {
 chr * (text.length() + 2)
}

def template(text) {
"""
${border(text, '_')}
< ${text} >
${border(text, '-')}
       \\   ^__^
        \\  (oo)\\_______
           (__)\\       )\\/\\
               ||----w |
               ||     ||
"""
}
