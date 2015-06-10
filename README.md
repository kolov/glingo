# glingo

Clojure client for Google Translate API. Based on http-kit

## Status
### Status
[![Build Status](https://travis-ci.org/kolov/glingo.svg?branch=master)](https://travis-ci.org/kolov/glingo.svg?branch=master)
 
## Usage

En [environ](https://github.com/weavejester/environ) key :google-translate-key must be configured. Then:

    glingo.core> (translate "hi" "en" "bg") 
    "здрасти"
    
    glingo.core> (def p  (translate-async "hi" "de" "en"))
    glingo.core/p
    glingo.core> @p
    {:data {:translations [{:translatedText "hi"}]}}

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
