$(document).ready(function() {

    $("h1").fadeIn(1000, function() {
        $("h2").fadeIn(1000, function() {
            $("#showMe").delay("slow").animate({top:"50px"}, function() {
                $(".bg-img").delay("slow").fadeIn(1000, function() {
                    $("#showMe").addClass("glow");
                });
            });
        });
    });

});