<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스케줄러</title>
<link rel="stylesheet" href="/static/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/static/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="/static/plugins/fullcalendar/fullcalendar.min.css" />
<style type="text/css">
</style>
</head>
<body>

	<div id="calendar"></div>

<script src="/static/plugins/jquery/jquery-3.1.0.min.js"></script>
<script src="/static/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="/static/plugins/momentjs/moment.min.js"></script>
<script src="/static/plugins/fullcalendar/fullcalendar.min.js"></script>
<script type="text/javascript">
$('#calendar').fullCalendar({
	header: {
		    left:   '',
		    center: 'title',
		    right:  'prevYear,prev,today,next,nextYear'
		},
		 events: [
		          {
		              title  : 'event1',
		              start  : '2016-09-01'
		          },
		          {
		              title  : 'event2',
		              start  : '2016-09-05',
		              end    : '2016-09-07'
		          },
		          {
		              title  : 'event3',
		              start  : '2016-09-09T12:30:00',
		              allDay : false // will make the time show
		          }
		      ],

    dayClick: function(date) {
    	console.log();

        alert('a day has been clicked!');
    }
});
</script>
</body>
</html>