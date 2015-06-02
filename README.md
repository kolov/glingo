# glingo

Clojure client for Google Translate API

## Usage

En environ key :google-translate-key mus be configured. Then:

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
