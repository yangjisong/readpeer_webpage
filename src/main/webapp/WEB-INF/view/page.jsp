<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE HTML>
<html>
  <head>
    <style type="text/css">
        .highlight {
            background-color: yellow;
        }
    </style>
    <script type="text/javascript" src="/static/js/rangy/rangy-core.js"></script>
    <script type="text/javascript" src="/static/js/rangy/rangy-classapplier.js"></script>
    <script type="text/javascript" src="/static/js/rangy/rangy-highlighter.js"></script>
<script>
   var serializedHighlights= decodeURIComponent(window.location.search.slice(window.location.search.indexOf("=") + 1));
   var highlighter;

   var initialDoc;

	window.onload = function() {
    rangy.init();

    highlighter = rangy.createHighlighter();

    highlighter.addClassApplier( rangy.createClassApplier("highlight") );

    if (serializedHighlights) {
        highlighter.deserialize(serializedHighlights);
    }
};
</script>

${pageBody}