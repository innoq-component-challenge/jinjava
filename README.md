# Demo app for INNOQ component callenge with Jinjava 

## Run

```
mvn spring-boot:run
```

Then goto http://localhost:8080

## Observations

* jinjava doesn't support macro block parameters: https://github.com/HubSpot/jinjava/pull/224/files
    * This prevents magic headers from working
    * Also breaks `call` parameter based named block support (see `card` macro in jinja demo)
* kwargs construction doesn't work like in jinja (e.g. `{{ button("Button with additional attributes", **{"data-foo": "bar", "aria-live": "polite"}) }}`)
* macro relfection params are not behaving like in jinja. E.g. `caller` (not `caller()`) inside a macro only returns false/null?.
