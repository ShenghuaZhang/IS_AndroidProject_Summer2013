package data;

import java.util.ArrayList;

public class ConferenceDataLoad {
    
	
	public ConferenceDataLoad() {
	}
    
	public void loadConferenceInfo() {
		Conference.title = "i-KNOW 2013";
		Conference.startDate = "Tuesday, September 4";
		Conference.description ="I-KNOW is a top-tier international conference in the areas of knowledge management and knowledge computing. Since 2001, i-KNOW has developed into the crystallization point for different disciplines of knowledge computing, such as knowledge discovery, knowledge analysis, knowledge visualization, social computing, mobile computing, context-aware computing, etc.";
		Conference.endDate = "Friday, September 6";
		Conference.location = "Messe Congress Graz, Austria";
        
	}
	public ArrayList<Keynote> loadKeynote(){
		ArrayList<Keynote> kList = new ArrayList<Keynote>();
		Keynote k;
		//Session 2  keynote
        //        k = new Keynote();
        //        k.ID = "1576";
        //        k.title = "Lessons from Project LISTEN: What have we learned from a reading tutor that listens?";
        //        k.description = "<p><img src=\"https://lh5.googleusercontent.com/SxByoa_YMEHrWiwyJjA_Ce7vrl-yFfR-uHmHXev8A-7rwTZ5wij17NcSL_0F3WO_GLzISEQ-hocg2AQOmqa5dC4z3dtDDnEmgky4aMzoNGC08gFRAAU1\" alt=\"Jack Mostow\" class=\"left\" > "
        //        		        +"<p>For over 20 years, Project LISTEN has worked on getting computers to listen to children read aloud, and help them learn to read. Along the way we have learned lessons about children, reading, speech technology, intelligent tutors, educational data mining, and doing AIED research in schools.</p>"
        //        		        +"<p>By the time I give this talk, I hope to have figured out what some of them are, memorable stories to illustrate them, and maybe even why you should care.</p>";
        //        k.date = "Wednesday, July 10";
        //        k.dayid = "5";
        //        k.beginTime = "09:00";
        //        k.endTime = "10:15";
        //        k.room = "FEC Theater";
        //        k.speakerName = "Jack Mostow";
        //        k.speakerAffiliation = "";
        //        kList.add(k);
		
		k = new Keynote(); //????????????????????
		k.ID = "1728";
		k.title = "Keynote";
		k.description = "<p><img src=\"http://www.zbw.eu/ueber_uns/profile/images/tochtermann_02.jpg\" alt=\"Klaus Tochtermann\" class=\"left\" > " ;
		k.date = "Wednesday, September 4";
		k.dayid = "2";
		k.beginTime = "11:00";
		k.endTime = "11:30";
		k.room = "4";
		k.speakerName = "Klaus Tochtermann";
		k.speakerAffiliation = "";
		kList.add(k);
		
		k = new Keynote();
		k.ID = "1743";
		k.title = "Knowledge Management im Einsatz für Competitive Intelligence - Relevante Informationen intelligent finden und analysieren ";
		k.description = "<p><img src=\"http://www.community-of-knowledge.de/uploads/tx_cok/userphotos/Schachner_Werner_klein.JPG\" alt=\"Werner Schachner\" class=\"left\" > "
        +  "<p><img src=\"http://t1.gstatic.com/images?q=tbn:ANd9GcR9b4Ke4-XbPon3pEsse0ySYFtt91n5OPeI1wT0KdWmkEApyK-Org\" alt=\"Alexander Stumpfegger\" class=\"left\" > " ;
		k.date = "Wednesday, September 4";
		k.dayid = "2";
		k.beginTime = "14:00";
		k.endTime = "14:30";
		k.room = "12B";
		k.speakerName = "Werner Schachner, Alexander Stumpfegger";
		k.speakerAffiliation = "";
		kList.add(k);
        
		k = new Keynote();
		k.ID = "1793";
		k.title = "Objective Fiction: The Semantic Construction of (Web) Reality";
		k.description = "The semantic web has somehow reached its maturity, with its merits and defects. A deep revision of its assumptions is ongoing in the community due to the lessons learnt, and the contact with other ways to implement semantics in legacy as well as neighboring (academic or industrial) research programmes. I will discuss how semantics contributes to the shaping of web knowledge, and beyond that, of social reality. That will be related to cognitive aspects as well as technological results. In particular, I will present methods and tools for the extraction, representation, and harnessing of semantic patterns."
        +  "<p><img src=\"http://i-know.tugraz.at/wp-content/uploads/2013/07/Aldo-Gangemi.jpeg\" alt=\"Aldo Gangemi\" class=\"left\" > " ;
		k.date = "Friday, September 6";
		k.dayid = "4";
		k.beginTime = "09:30";
		k.endTime = "10:30";
		k.room = "1";
		k.speakerName = "Aldo Gangemi";
		k.speakerAffiliation = "";
		kList.add(k);
        
		k = new Keynote();
		k.ID = "1781";
		k.title = "Current and Future Uses of Semantic Web Technologies at the BBC";
		k.description = "The BBC generates a vast quantity of information, broadcasting between 1,000 and 1,500 programmes per day and generating a significant news output. The BBC has also accumulated a very large archive of TV and radio programmes, as well as pictures, texts, musical scores etc. since 1922. Managing all this information constitutes a major challenge. In this talk we are going to give an overview of how Semantic Web technologies are being used on the BBC web site to facilitate consuming, managing and publishing this information. We will first describe various Semantic Web-related efforts undertaken by the BBC since 2004 and how those efforts are now converging in a BBC Linked Data Platform. We will then describe work undertaken by BBC R&D to investigate how a mixture of Semantic Web technologies, machine-generated annotations and crowdsourcing can enable us to publish large archives of content very quickly."
        +  "<p><img src=\"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBhQSEBQUEBQUFBQUFBQVFBYUFxQUFBQUFBQVFBQUFBQXHCYeFxkkGRQUHy8gJCcpLCwsFR4xNTAqNSYrLCkBCQoKDgwOFw8PFCkcHCQpKSksLCwpKSwsLCkpKSkpKSwpKSwpLCwsLCkpKSkpKSwpLCwsKSwsLCksLCksKSwpKf/AABEIAL0BCwMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAABAgQFAAMGB//EAD0QAAIBAgMECQIFAgQHAQAAAAABAgMRBCExBRJBUQYiYXGBkaGx8BPBBzJS0eFi8SNCgrIUJDNDcsLSFf/EABgBAQEBAQEAAAAAAAAAAAAAAAABAwIE/8QAHxEBAQACAwEBAAMAAAAAAAAAAAECEQMhMRJBE1Fh/9oADAMBAAIRAxEAPwDtrAsEyxFCxlhgMAFftnbVPDU3UquyWSS1k+EYrmUXSrp3HDN06aUqls7vqx7MtX87DzXbfSKripXqvT8qV7LnZERM6U9MqmLdrblNPKCd79snxZT0dnznG6WS833EvZGy9970tDpKNJJZIly07xw25bD7FnJ2WnPRF9gOjUVnJ3foWlKiTadIyvJXox4pEansiCzsjf8A8FHgkSYxNkV2HFyrWYRBeCXIj19nRfBXWhbypml0h9VbhHO4rY0WtCg2jsZxzj5fsdzOgQMVhr8DrHNjlxSuAUuZYbI2pOjVjOnJxafB2uuKfNEvamyb3cdfcondPPgby7eWzT3fo9tmOJoxmvzaSXJotDxPo30nnhp3i7xb60Xo+58GeubG2tHEUo1I5by0fD9wieAYAUoLDACFYrHYCqQDGAwFFY7FYCCsditAKxbDMUC6MCZYIBTdKturC4eUv8z6sF/U9Pu/At607Jt8Dx7pft94mtl/04XUFw5OXe7ehBzeJrOc3KbvKTbbet39zbs7B78s9Ea/paduZfbLw1lZC3UdYzdWGFopKyJtKkJRpk6nSyPNlXsxh6WHJUaaNcF/c2qRw0HdQ8bAt3G2FMqldmaZxzJv0SPVgNKjTgRqtHkSpxNM5EcqzFYRM5bbWzeK1XqdrOzKzaeEvFmuGWmPJhuOEp6nZ9AdsulV3ZSe5PJK+SlwduHI5bG4VxlczC1XGSa4Z+Rv68b32nK6Xz1GOf6LbajXpLRSS6yXNcbHQIKDQBgMIVisYACsAwoUrAxmBlCMVocVgIwDMAFyYEARyf4hbXdOgqcXaVS93xUFr5tpd1zyqb15vJemR234k4jerqP6aaXjKV/axxeJyyWq9+PzsIDT/N7/AMHRbNp5HO4OGZ1OBp9U5za8abQiSb5ZfuRnVSNcsar/AMmOnp3pYU43JcKRSQ2nTiutJErC7cpfqL8H3ItlAZQNVDFxdrNO5L+mS4u5lsjkzXOJIjTyNGJnuq7JI6t0j1KRFq0+0SvtiCur6FbX29Sf+a3mdfDK8kTJs0VHdER7Wp8Jp+XsMsUnoPnSfUqp2rhLxZztSLTy7/2Ou2grxZy9eOvY/n3NcK83JO3QdD9qulWjn1ZZNcj1yk7q64nhezo55dnz2PYOjGMdShFy108sjpwtgMZgYCgYWAIDFGYGFKxRmBlCsVjMDARgGYoFyZYwwI8u/EGm1i229YprkrfLnF4id33WX3O+/EqX+NHspq3a3N/Y88k8wJezIOUzraOUV2FBsGjqy12jXcabtq8l3szy7rfj6m0XaW0rZJ+WvYiNDB1qqW5Ge73a+fAsdibFu9+rm+TvkdFTrU6asksuC4DcxWYXP1xNTZdWDzhK/dcFCnO+aad8srZndLa0bflT+dwI1KdThZ89UPp1/Aq9lyas5aXs1m1zuu3I6ijVyKuWHSZKpTtqZ5ZNMcdJ0KiK/bE1u2fflq9Te6ysQMRUUhMnWU25HaO8st3L0Kffcnpfstc7qvh4yXW087mQqUqa/Il3v9jT7YXhtcXDZk5rKDTvrayMvUotb0cuP7Hc/wD6EHwXuLXw8KkXZLPw87D6/tLw2Oep4hVI5fyc/iodaS+alzPC/Rr2X5ZLusyt2tTtNMuPrPLwuAj1mlxzXG/M9P6DVL0WuT98zy7BtqWXPy0yPSOgdW7qcF1fY6rN2DFYwGFKxRhQMAEAAYrGYrAUDGFAVgGYALgwICjzz8T6f+JSlbLcku93vqecV1ZvvZ6R+J2IvKnDlFvzf8HnGKnqEXuwvyLvLSOGdSql/lh6sp+jjvE6fZ9O3fz0MsrqvRh3IbGVVTg28iqwanX3vpvdis03+eT1W6uGfEtcVg1UaurpZ9ja9zbDDRXCxzK31vpyMZTjJ2lNNuPHLje7vk/y8PY6fC4N06cJSmpOSTcW0pLutr4kqGHpq9kn4XZtUlHN29LnVu0wwuN3tt+rCVO64c8iLXr5IapNySvklovuyJN3muwytaaTJSyIFGprF/q9yxjDIrK2VTvyYhYk1qkVaMWnLLXqrPm39il2/RlGW653i7PqJNZp6K95eZfYer1bSimudk2ux9hmIpx/Qmnxt8saY3TnKfU05jZ2FnUjJ78o7qTz60b8mmStkbR6+5LKXo7cU+JZLCwta6X3A9jxdnbTR6fyLZXEwuP6i7bwe8t5arM53bHD5wOxrx6jXLg3n58TjtsxyQwu6x5IhYFZ2+P5c9I/D3/uLlu+x5phHaXzW37nqHQG7VV/1Jd3VWRrWDrmBjWBYKQAzFCAAZoAUrAwsUACjAAVgCwAXJjCYUeXdPcLUnXlJJuyikv6Vfh3nCYum4uz5HtPSTB9dS5xa8V/c866VbNW5CpHW+617HH13ppcN4/UR+jceozosMzndhO0HzOjwMdMjPNpx+RZQVvLP7JDzqo1x1H+hcz29UxalPkszZSoXd2bIYfMmU6GWeQdaV+JyWWhWp9Y37Rxt5OMdF7mnCUW83qE0sUurcp8Q+uXv0nuFPjcK9bWaBl4k4SVsmsmbpRa/LpyIWycVee7LR6F1PDZZAiJCqjbKWWWpkqHYa5U2hUsRcbTy87Pk+MWchtuPVXezsayujk9vQsvE74728vLOlNRo3WXH78Pc7/oDjt2U6ct67aasrrTRlH0TwanFuST+Je51fQvBJyrTV1/iOKtyjkbb3WNx1jK69ACgHTgBRgEUoGMxQFYBmKwFAwgKFYAswgurGWCYVEPamH3qbsruPWXhqvFXPPNr0E8NK/O68z084LpRJUo1YbqfWur8FLNNebRnnPK3471Y4vZq3W4vU6bBnKYafW8bZ+x0+Blf0Oc146tqMSZTpEDC1CxpzM49cp2klmaatW5ladyHiK+6mvUerbIroqKb3r3u9Fdm/C42G9u8tU1ZrwZpqO+mvAjVcM5NSae8tGnmjv4Zfbro4iFtOBRbVxMYtJavRcX3Ij08XU5ZkGrSk570s5cHy7ifO/S5z8bqa68cmmpZ3L+jXOcptpZ5tvP+CxwtfnyFxMc1w1dZGmqhKWI4BxDyOK03tBxSOV29LgdJi6t8jlekD6x3x+vPy+LDY2KVHDynyWS5ybdl7M7joTg3DCRc9Ztzf8Aqdzg9i4H69WhR1iuvPuWi+cz1mnGySXBWNZHnyy3qCAIDtwDAwgYUABAwFYrGYrIAxRmKygMAWLYgvrAsPYyx0hLHK9NNm70d/g47svszq2jRjMKqkHF8USzbrG6u3hdVOE7P9XjyOl2bPQpukWAdPETuu+/B3s185k3Y+IvFPw8jOzcaY9VfQW7JosKcsiDJ5xfZ7f3JdN5NGOnplaa9bVkHEVLm+PWuCphuLNJ043tHprsub4xt3mU3FfPublU5IbaTjtBytwysaKsbrRm/wCqyPVxDb1+yG67nB/qHLtGpz9zKuIS4oXB4qDlbLzLtnePX6mOo7X5El1m4XfISph0725C1sqPbp5nGWq4nTRhaO8nOWnD9zlNsyvUfkvE7bF2jTtyRwWMq3qStrw/cuDLkrtPw5wq3qk3m8oruR3ZSdENnqlhoLi1d97Ls2jBjAYYUBgCKFYKEDADFGYrAArCBgBgMYCDorAsbXEVo6RraFNjQjQHMdL+ijxMd6k4qouekl2vgziIbJnhnuVFaSzaWfqeuNHDdMl/zGX6I+acv4OMvHePqFQneHc9CZhqpUYOvbLmTYOzMbG8qVSp2efEhbQhUa6rS8yVVxOS5gjO5HeN7VEIyWrz7EbGpc35lg0lqLKEeXC9zqXpvOST1C/4aXN+bMnhOdiQ4z4NLwNSpu+cmzrR/NiiPD8kZh8Pn29xOrLghKUc89Tms8s9+JVHEcHxNO0p2SS/UvcjVqtmhK9beaJpja37VxVoO74M5LY2AlXrxUVdOV353LDpBjerurWWX7/O07zobsSNHDwbVptXb45mmMY51eYWnuwS5KxtCA0ZgYYBgADCwMKAAgAUDCwAKBhYGArAFgA6txElEmOn88TU4HSIriI0SJL2NL0A01HZN8lc8rxFW9WUm77zbfzxPR9v19zD1Wtd23m7HmdX7P1eXsvMlm+ll1dtW9aVizpVrxKiv7ez0TNmFxPAxyxrbHKJ86mZuw9W6zIFSYaNSzT8yadfXa1avqZ9NZ/LkeFa6sOm+ZNad7Pe2hl/6R6GHdr6m5Ya6OtmkCcwOpyNuIppEGpUtd9hEtRcTVuzXGrZNsj1q1zV+Z7i0WcuxcvEtjLbbsjZUsTi4NrqLPwXDzPWqcLJJcDyzZmLlTlvRe64t2a71rzWeh6HsTa6r075KSyklp2NdhpJ0yvqxAEDKjAMwAGMBjAwrBWFgYAYoWBgADMYGAAGMUD0L6PzzZFnTsy1nH56EKtlJv8AT6/mOkV8oe37miUcvP7fuTqyzfdb1Ic5Zd1/dfsBV7cpb2Hqr+hvyz+x5fWfq4ryX8Hq+PX+HP8A8Zf7TyiSzXi/VfyIEfHlvWXdmvt6kSrHda5PT7ok8F3v7gqK6ad7Pet2NPX1FmyXRY1boX6tn2fNAQptWv4Pg0NUoXWa+dhj419SMLiGnbxLOlUX3v6nNzbj2mylti1r3LpZlp11KorWv5DyrpX+WOXjtxdr8BXtt8N7yOdOvtc4zELPn2FRj8Uku8hYjar0jF+JBkp1Hm9fmZdOLkP1JTlaHnwRa0MIoRsuObfN9pmBwO4s+Y+JxUM0msrq70uln3k98Jqd1Fw0W3Lk2/F8l5F50SxFR4xxT6u4nLlnmsjj9o7ajGKjBXd1K7tk0+zjkdn0Crb1eq+G7BX8OBr+MndmGAAwAQBQYGFigYKwsDADFYzFADFYzFYAYDGAD0ytp6+RDnHJ38e3Jx9rDU6nV89MtUaarz/1NeqOka6zz72/Vyf2IEtCXUeb7pff9ym2ptH6UHLd3rWyvbn2DQTbNS1Cq/6Je1vueWSl+Z9nz/cWm1ekVWu+s7RvlBfl8efiVcv/AGXpYsQLZpck/wD59zW3ku/3bNjlm3yS9Ff7CKNlHv8AnuULB6cs8uDtc3U6vY7Xtnqu7sNEo5+K9UCXl/aRLNrLpYRwilms+4RbGQuDxLXWXDXlK3sy9wkt+KemVzDKXFrLKpY7MS4CTwPYXtSks32+uT+5Gqw9cznbrTnK+GzN2DwqWcskvlzfXWZv+nem12FTSK1vPekslbcjwfNs5XbdZwqyso2ksrxTte6bjlk/nIv6s2oRd85b3pp7FJ0jp33X3r0TNtdMbVM7tdyy045u561+HeH3ac3xcvsjyZTtGL45rPPLVZPx8z0L8OtpS3oxeal1X4JWb5kHpBhgArABAAGBhAwABmAYAYozFYAYozFYAYDGC5B//9k=\" alt=\"Yves Raimond\" class=\"left\" > " ;
		k.date = "Friday, September 6";
		k.dayid = "4";
		k.beginTime = "15:00";
		k.endTime = "16:00";
		k.room = "1";
		k.speakerName = "Yves Raimond";
		k.speakerAffiliation = "";
		kList.add(k);
        
		k = new Keynote();
		k.ID = "1791";
		k.title = "Skype: Continuous Learning of Skype Engineers";
		k.description = "Skype is now part of Microsoft where learning and development is happening every day. Skype is probably organization and also technology that has seen a lot of changes over the years but has managed to keep it together and show persistent growth both in numbers and organization size. We are global engineering organization and master distributed development in agile way. By now we have reached situation where we recognize that no matter how you organize or what methodology you choose, you just change one set of problems to another. In my presentation I will walk with you through biggest changes and do few deep dives on some of most challenging issues."
		+  "<p><img src=\"http://uudised.err.ee/failid/246970_01.jpg\" alt=\"Tiit Paananen\" class=\"left\" > " ;
		k.date = "Wednesday, September 4";
		k.dayid = "2";
		k.beginTime = "09:30";
		k.endTime = "10:30";
		k.room = "1";
		k.speakerName = "Tiit Paananen";
		k.speakerAffiliation = "";
		kList.add(k);
        
		k = new Keynote();
		k.ID = "1785";
		k.title = "The Science of Social Interactions on the Web";
		k.description = "Social interactions have always been an important part of human learning and experience. We now know that social interactions are critical in many knowledge and information processes. Research has shown results ranging from influences on our behavior from social networks [Aral2012] to our understanding of social belonging on health [Walton2011], as well as how conflicts and coordination play out in Wikipedia [Kittur2007]. Interestingly, social scientists have studied social interactions for many years, but it wasn’t until very recently that researchers can study these mechanisms through the explosion of services and data available on web-based social systems. In this talk, I plan to illustrate a model-driven approach to researching social interactions on the Web. Our research methods and systems are informed by models such as information scent, sensemaking, information theory, probabilistic models, and evolutionary dynamic models. These models have been used to understand a wide variety of user behaviors, from individuals interacting with social bookmarks in Delicious to groups of people working on articles in Wikipedia. These models range in complexity from a simple set of assumptions to complex equations describing human and group behaviors. By using this model-driven approach, we further our understanding of how knowledge is fundamentally constructed in a social context, and a path forward for further social interaction research."
        +  "<p><img src=\"http://research.google.com/pubs/people_images/15067.png\" alt=\"Ed H. Chi\" class=\"left\" > " ;
		k.date = "Thursday, September 5";
		k.dayid = "3";
		k.beginTime = "09:30";
		k.endTime = "10:30";
		k.room = "1";
		k.speakerName = "Ed H. Chi";
		k.speakerAffiliation = "";
		kList.add(k);
        
		k = new Keynote();
		k.ID = "1753";
		k.title = "Supporting Professional Communities in the Next Web (16.30 – 17.30) ";
		k.description = "<p><img src=\"http://www.prolearn-academy.org/Events/Past%20Events/summer-school-2008/speakers/image/klamma-05.jpg/image_mini\" alt=\"Ralf Klamma\" class=\"left\" > " ;
		
		k.date = "Wednesday, September 4";
		k.dayid = "2";
		k.beginTime = "16:30";
		k.endTime = "17:30";
		k.room = "12A";
		k.speakerName = "Ralf Klamma";
		k.speakerAffiliation = "";
		kList.add(k);
        
        
        
		
		return kList;
	}
	public ArrayList<Poster> loadPoster(){
		ArrayList<Poster> poList = new ArrayList<Poster>();
		Poster s;
		//poster 1
		
		s = new Poster();
		s.ID = "8746";
		s.name = "Success Factors of Enterprise 2.0";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8747";
		s.name = "Semantically Based Visual Tracking of Engineering Tasks in Automotive Product Lifecycle";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8748";
		s.name = "Advanced Mining of Association Rules over Periodic Snapshots in a Data Warehouse";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8749";
		s.name = "And Data for All: On the Validity and Usefulness of Open Government Data";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8750";
		s.name = "On the Implications of Lessons Learned Use for Lessons Learned Content";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8751";
		s.name = "Investigating Factors for Knowledge Sharing Using Web Technologies";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8752";
		s.name = "Capturing and Sharing Scientific Research Data";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8753";
		s.name = "Success Factors of Enterprise 2.0";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8754";
		s.name = "Semantically Based Visual Tracking of Engineering Tasks in Automotive Product Lifecycle";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8755";
		s.name = "Advanced Mining of Association Rules over Periodic Snapshots in a Data Warehouse";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8756";
		s.name = "And Data for All: On the Validity and Usefulness of Open Government Data";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8757";
		s.name = "On the Implications of Lessons Learned Use for Lessons Learned Content";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8758";
		s.name = "Investigating Factors for Knowledge Sharing Using Web Technologies";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
		s = new Poster();
		s.ID = "8759";
		s.name = "Capturing and Sharing Scientific Research Data";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		poList.add(s);
        
        
        
		
		return poList;
	}
	public ArrayList<Workshop> loadWorkshopsDes() {
		//this.IdtoDate();
		
		ArrayList<Workshop> wList = new ArrayList<Workshop>();
        
		Workshop s;
        
		s = new Workshop();
		s.ID = "1";
		s.name = "EU-Day (3) Synergy Workshop: Evaluation";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "17:00";
		s.room = "10";
		s.content = "<p></p>";
		s.childsessionID = "1754";
		wList.add(s);
        
		s = new Workshop();
		s.ID = "2";
		s.name = "PhD Cooperation Event";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "Gallery";
		s.content = "<p></p>";
		s.childsessionID = "1771";
		wList.add(s);
        
		s = new Workshop();
		s.ID = "3";
		s.name = "ICT Alpe Adria Workshop (2)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "10";
		s.content = "<p>Graphic Recording, Dissemination Strategy, Press Relations and Social Media for Researchers Including Elevator Pitch Contest</p>";
		s.childsessionID = "1767";
		wList.add(s);
        
		s = new Workshop();
		s.ID = "4";
		s.name = "ICT Alpe Adria Workshop (1)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:30";
		s.endTime = "15:00";
		s.room = "10";
		s.content = "<p>Graphic Recording, Dissemination Strategy, Press Relations and Social Media for Researchers Including Elevator Pitch Contest</p>";
		s.childsessionID = "1746";
		wList.add(s);
        
		s = new Workshop();
		s.ID = "5";
		s.name = "ICT Alpe Adria Workshop (3)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "10";
		s.content = "<p>Graphic Recording, Dissemination Strategy, Press Relations and Social Media for Researchers Including Elevator Pitch Contest</p>";
		s.childsessionID = "1762";
		wList.add(s);
        
		return wList;
	}
	public ArrayList<Session> loadSessions(){
		ArrayList<Session> sList = new ArrayList<Session>();
		Session s;
        
        
		s = new Session();
		s.ID = "1724";
		s.name = "TEL EU-DAY (1) Synergy Workshop: User Modelling";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "10";
		sList.add(s);
        
		s = new Session();
		s.ID = "1725";
		s.name = "PWM Wissenstag (1)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1726";
		s.name = "i-Praxis: KT Applications in Industry (1)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "12B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1727";
		s.name = "Coffee Break";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "15:30";
		s.endTime = "16:30";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1728";
		s.name = "Science 2.0 (1)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "4";
		sList.add(s);
        
		s = new Session();
		s.ID = "1729";
		s.name = "SmartGrid (1)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "11B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1730";
		s.name = "Ontological Engineering (1)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "5";
		sList.add(s);
        
		s = new Session();
		s.ID = "1731";
		s.name = "Knowledge & Data Analytics (1)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1732";
		s.name = "i-Praxis KT Applications in industry (3)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "12B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1733";
		s.name = "Knowledge & Data Analytics (2)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1734";
		s.name = "SmartGrid (2)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "11B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1735";
		s.name = "Smart Mobility (1)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "12B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1736";
		s.name = "Science 2.0 (2)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "4";
		sList.add(s);
        
		s = new Session();
		s.ID = "1737";
		s.name = "Ontological Engineering (2)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "5";
		sList.add(s);
        
		s = new Session();
		s.ID = "1738";
		s.name = "Coffee Break";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "10:30";
		s.endTime = "11:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1739";
		s.name = "Knowledge & Data Analytics (4)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1740";
		s.name = "Ontological Engineering (3)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "5";
		sList.add(s);
        
		s = new Session();
		s.ID = "1741";
		s.name = "PWM Wissenstag (2)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1742";
		s.name = "EU-DAY (4) Trends in HR";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "11A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1743";
		s.name = "i-Praxis KT Applications in Industry (2)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "12B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1744";
		s.name = "EU-Day (2) Synergy Workshop: User Support";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "14:00";
		s.endTime = "15:30";
		s.room = "10";
		sList.add(s);
        
		s = new Session();
		s.ID = "1745";
		s.name = "Smart Health (1)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1746";
		s.name = "ICT Alpe Adria Workshop (1)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:30";
		s.endTime = "17:30";
		s.room = "10";
		sList.add(s);
        
		s = new Session();
		s.ID = "1747";
		s.name = "Linked Data Cup";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "4";
		sList.add(s);
        
		s = new Session();
		s.ID = "1748";
		s.name = "Linked Data Management (1)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "5";
		sList.add(s);
        
		s = new Session();
		s.ID = "1749";
		s.name = "Poster & Demo Session";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:30";
		s.endTime = "17:30";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1750";
		s.name = "Social & Mobile Computing (2)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1751";
		s.name = "Smart Mobility (2)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "12B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1752";
		s.name = "Smart Health (2)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1753";
		s.name = "PWM Wissenstag (3)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1754";
		s.name = "EU-Day (3) Synergy Workshop: Evaluation";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "10";
		sList.add(s);
        
		s = new Session();
		s.ID = "1755";
		s.name = "Knowledge & Data Analytics (3)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1756";
		s.name = "Science 2.0 (3)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "4";
		sList.add(s);
        
		s = new Session();
		s.ID = "1757";
		s.name = "SmartGrid (3)";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "16:30";
		s.endTime = "18:00";
		s.room = "11B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1758";
		s.name = "Linked Data Management (2)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "5";
		sList.add(s);
        
		s = new Session();
		s.ID = "1759";
		s.name = "Break";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "17:30";
		s.endTime = "18:30";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1760";
		s.name = "Social Event (dress code: smart casual)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "18:30";
		s.endTime = "23:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1761";
		s.name = "Knowledge Management in Industry (1)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "4";
		sList.add(s);
        
		s = new Session();
		s.ID = "1762";
		s.name = "ICT Alpe Adria Workshop (3)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "10";
		sList.add(s);
        
		s = new Session();
		s.ID = "1763";
		s.name = "Social & Mobile Computing (1)";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1764";
		s.name = "i-Praxis KM in Organization Development (2)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1765";
		s.name = "i-Praxis Social Media in Industry";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "11B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1766";
		s.name = "i-Praxis Workshop: Licensing Linked Data";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "12B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1767";
		s.name = "ICT Alpe Adria Workshop (2)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "10";
		sList.add(s);
        
		s = new Session();
		s.ID = "1768";
		s.name = "Poster & Demo 1 Minute Madness";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1769";
		s.name = "i-Praxis Current Developments in Publishing";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "11B";
		sList.add(s);
        
		s = new Session();
		s.ID = "1771";
		s.name = "PhD Cooperation Event";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "Gallery";
		sList.add(s);
        
		s = new Session();
		s.ID = "1772";
		s.name = "i-Praxis KM in Organization Development (1)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "12A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1774";
		s.name = "Knowledge Engineering";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "11:00";
		s.endTime = "12:30";
		s.room = "5";
		sList.add(s);
        
		s = new Session();
		s.ID = "1775";
		s.name = "Coffee Break";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "15:00";
		s.endTime = "15:30";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1776";
		s.name = "Farewell and Coffee";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "16:00";
		s.endTime = "17:00";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1777";
		s.name = "Knowledge & Data Analytics (5)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "3";
		sList.add(s);
        
		s = new Session();
		s.ID = "1778";
		s.name = "Knowledge Management in Industry (2)";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "4";
		sList.add(s);
        
		s = new Session();
		s.ID = "1779";
		s.name = "Lunch Break";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "12:30";
		s.endTime = "14:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1780";
		s.name = "Guided Tour from the Conference Venue to the Welcome Reception, Meetingpoint: registration desk";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "18:30";
		s.endTime = "19:30";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1781";
		s.name = "Closing Keynote: Current and future uses of Semantic Web technologies at the BBC";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "15:00";
		s.endTime = "16:00";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1782";
		s.name = "Welcome Reception: Alte Universität, Hofgasse 14, 8010 Graz";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "19:30";
		s.endTime = "21:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1783";
		s.name = "Registration";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "09:00";
		s.endTime = "09:30";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1784";
		s.name = "Coffee Break";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "10:30";
		s.endTime = "11:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1785";
		s.name = "Keynote: The Science of Social Interactions on the Web";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "09:30";
		s.endTime = "10:30";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1786";
		s.name = "Lunch";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "12:30";
		s.endTime = "14:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1787";
		s.name = "Opening";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "09:00";
		s.endTime = "09:30";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1788";
		s.name = "Registration";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "08:00";
		s.endTime = "09:00";
		s.room = "Ground Floor";
		sList.add(s);
        
		s = new Session();
		s.ID = "1789";
		s.name = "Coffee Break";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "10:30";
		s.endTime = "11:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1790";
		s.name = "Lunch";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "12:30";
		s.endTime = "14:00";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1791";
		s.name = "Keynote: Skype: Continuous Learning of Skype engineers";
		s.date = "Wednesday, September 4";
		s.day_id = "2";
		s.beginTime = "09:30";
		s.endTime = "10:30";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1792";
		s.name = "Registration";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "09:00";
		s.endTime = "09:30";
		s.room = "N/A";
		sList.add(s);
        
		s = new Session();
		s.ID = "1793";
		s.name = "Keynote: Objective fiction: the semantic construction of (web) reality";
		s.date = "Friday, September 6";
		s.day_id = "4";
		s.beginTime = "09:30";
		s.endTime = "10:30";
		s.room = "1";
		sList.add(s);
        
		s = new Session();
		s.ID = "1795";
		s.name = "EU-DAY (5) - Trends in HR";
		s.date = "Thursday, September 5";
		s.day_id = "3";
		s.beginTime = "14:00";
		s.endTime = "15:00";
		s.room = "11A";
		sList.add(s);
        
        
        
        
		return sList;
	}
	public ArrayList<Paper> loadPapers(){
		ArrayList<Paper> pList = new ArrayList<Paper>();
		Paper p;
		
		p = new Paper();
		p.id = "8603";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1731";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5605";
		pList.add(p);
        
		p = new Paper();
		p.id = "8604";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1731";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5606";
		pList.add(p);
        
		p = new Paper();
		p.id = "8605";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1731";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5607";
		pList.add(p);
        
		p = new Paper();
		p.id = "8606";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Keynote";
		p.belongToSessionID = "1728";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5608";
		pList.add(p);
        
		p = new Paper();
		p.id = "8607";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1728";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5609";
		pList.add(p);
        
		p = new Paper();
		p.id = "8608";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1728";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5610";
		pList.add(p);
        
		p = new Paper();
		p.id = "8609";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1730";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5611";
		pList.add(p);
        
		p = new Paper();
		p.id = "8610";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1730";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5612";
		pList.add(p);
        
		p = new Paper();
		p.id = "8611";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1730";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5613";
		pList.add(p);
        
		p = new Paper();
		p.id = "8615";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1725";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5617";
		pList.add(p);
        
		p = new Paper();
		p.id = "8616";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1725";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5618";
		pList.add(p);
        
		p = new Paper();
		p.id = "8617";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1725";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5619";
		pList.add(p);
        
		p = new Paper();
		p.id = "8618";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1726";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5620";
		pList.add(p);
        
		p = new Paper();
		p.id = "8620";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1726";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5622";
		pList.add(p);
        
		p = new Paper();
		p.id = "8621";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1724";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5623";
		pList.add(p);
        
		p = new Paper();
		p.id = "8622";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1724";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5624";
		pList.add(p);
        
		p = new Paper();
		p.id = "8623";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1724";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5625";
		pList.add(p);
        
		p = new Paper();
		p.id = "8624";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1733";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5626";
		pList.add(p);
        
		p = new Paper();
		p.id = "8625";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1733";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5627";
		pList.add(p);
        
		p = new Paper();
		p.id = "8626";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1733";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5628";
		pList.add(p);
        
		p = new Paper();
		p.id = "8627";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1736";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5629";
		pList.add(p);
        
		p = new Paper();
		p.id = "8628";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1736";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5630";
		pList.add(p);
        
		p = new Paper();
		p.id = "8629";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1736";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5631";
		pList.add(p);
        
		p = new Paper();
		p.id = "8630";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1737";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5632";
		pList.add(p);
        
		p = new Paper();
		p.id = "8631";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1737";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5633";
		pList.add(p);
        
		p = new Paper();
		p.id = "8632";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1737";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5634";
		pList.add(p);
        
		p = new Paper();
		p.id = "8635";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1741";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5637";
		pList.add(p);
        
		p = new Paper();
		p.id = "8636";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1741";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5638";
		pList.add(p);
        
		p = new Paper();
		p.id = "8637";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1741";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5639";
		pList.add(p);
        
		p = new Paper();
		p.id = "8638";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Keynote";
		p.belongToSessionID = "1743";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5640";
		pList.add(p);
        
		p = new Paper();
		p.id = "8639";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1743";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5641";
		pList.add(p);
        
		p = new Paper();
		p.id = "8640";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1743";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5642";
		pList.add(p);
        
		p = new Paper();
		p.id = "8641";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1744";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5643";
		pList.add(p);
        
		p = new Paper();
		p.id = "8642";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1744";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5644";
		pList.add(p);
        
		p = new Paper();
		p.id = "8643";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1744";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5645";
		pList.add(p);
        
		p = new Paper();
		p.id = "8644";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1755";
		p.exactbeginTime = "16:30";
		p.exactendTime = "17:00";
		p.presentationID = "5646";
		pList.add(p);
        
		p = new Paper();
		p.id = "8647";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1756";
		p.exactbeginTime = "17:30";
		p.exactendTime = "18:00";
		p.presentationID = "5648";
		pList.add(p);
        
		p = new Paper();
		p.id = "8653";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Workshop";
		p.belongToSessionID = "1754";
		p.exactbeginTime = "16:30";
		p.exactendTime = "17:00";
		p.presentationID = "5653";
		pList.add(p);
        
		p = new Paper();
		p.id = "8658";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1757";
		p.exactbeginTime = "16:30";
		p.exactendTime = "17:00";
		p.presentationID = "5658";
		pList.add(p);
        
		p = new Paper();
		p.id = "8661";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1754";
		p.exactbeginTime = "17:00";
		p.exactendTime = "17:30";
		p.presentationID = "5661";
		pList.add(p);
        
		p = new Paper();
		p.id = "8662";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1754";
		p.exactbeginTime = "17:30";
		p.exactendTime = "18:00";
		p.presentationID = "5662";
		pList.add(p);
        
		p = new Paper();
		p.id = "8663";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1763";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5663";
		pList.add(p);
        
		p = new Paper();
		p.id = "8664";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1763";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5664";
		pList.add(p);
        
		p = new Paper();
		p.id = "8665";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1763";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5665";
		pList.add(p);
        
		p = new Paper();
		p.id = "8666";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1747";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:20";
		p.presentationID = "5666";
		pList.add(p);
        
		p = new Paper();
		p.id = "8667";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1747";
		p.exactbeginTime = "11:20";
		p.exactendTime = "11:40";
		p.presentationID = "5667";
		pList.add(p);
        
		p = new Paper();
		p.id = "8668";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1747";
		p.exactbeginTime = "11:40";
		p.exactendTime = "12:00";
		p.presentationID = "5668";
		pList.add(p);
        
		p = new Paper();
		p.id = "8669";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Short Paper";
		p.belongToSessionID = "1747";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:20";
		p.presentationID = "5669";
		pList.add(p);
        
		p = new Paper();
		p.id = "8670";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1748";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5670";
		pList.add(p);
        
		p = new Paper();
		p.id = "8671";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full paper";
		p.belongToSessionID = "1748";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5671";
		pList.add(p);
        
		p = new Paper();
		p.id = "8672";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1748";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5672";
		pList.add(p);
        
		p = new Paper();
		p.id = "8682";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1735";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5682";
		pList.add(p);
        
		p = new Paper();
		p.id = "8683";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1735";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5683";
		pList.add(p);
        
		p = new Paper();
		p.id = "8684";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1735";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5684";
		pList.add(p);
        
		p = new Paper();
		p.id = "8688";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Workshop";
		p.belongToSessionID = "1771";
		p.exactbeginTime = "11:00";
		p.exactendTime = "12:30";
		p.presentationID = "5688";
		pList.add(p);
        
		p = new Paper();
		p.id = "8690";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1750";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5690";
		pList.add(p);
        
		p = new Paper();
		p.id = "8691";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1750";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5691";
		pList.add(p);
        
		p = new Paper();
		p.id = "8692";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1758";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5692";
		pList.add(p);
        
		p = new Paper();
		p.id = "8693";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Full Paper";
		p.belongToSessionID = "1758";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5693";
		pList.add(p);
        
		p = new Paper();
		p.id = "8696";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1751";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5696";
		pList.add(p);
        
		p = new Paper();
		p.id = "8697";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1751";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5697";
		pList.add(p);
        
		p = new Paper();
		p.id = "8705";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1761";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5705";
		pList.add(p);
        
		p = new Paper();
		p.id = "8706";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Short Paper";
		p.belongToSessionID = "1761";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5706";
		pList.add(p);
        
		p = new Paper();
		p.id = "8707";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1761";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5707";
		pList.add(p);
        
		p = new Paper();
		p.id = "8708";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1774";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5708";
		pList.add(p);
        
		p = new Paper();
		p.id = "8709";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1774";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5709";
		pList.add(p);
        
		p = new Paper();
		p.id = "8710";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1774";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5710";
		pList.add(p);
        
		p = new Paper();
		p.id = "8711";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1769";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5711";
		pList.add(p);
        
		p = new Paper();
		p.id = "8712";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1769";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5712";
		pList.add(p);
        
		p = new Paper();
		p.id = "8713";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1769";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5713";
		pList.add(p);
        
		p = new Paper();
		p.id = "8714";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1772";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5714";
		pList.add(p);
        
		p = new Paper();
		p.id = "8715";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1772";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5715";
		pList.add(p);
        
		p = new Paper();
		p.id = "8716";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1772";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5716";
		pList.add(p);
        
		p = new Paper();
		p.id = "8721";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1778";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5721";
		pList.add(p);
        
		p = new Paper();
		p.id = "8722";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1778";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5722";
		pList.add(p);
        
		p = new Paper();
		p.id = "8725";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1764";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5725";
		pList.add(p);
        
		p = new Paper();
		p.id = "8726";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1764";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5726";
		pList.add(p);
        
		p = new Paper();
		p.id = "8736";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5751";
		pList.add(p);
        
		p = new Paper();
		p.id = "8737";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5752";
		pList.add(p);
        
		p = new Paper();
		p.id = "8775";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5753";
		pList.add(p);
        
		p = new Paper();
		p.id = "8772";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5754";
		pList.add(p);
        
		p = new Paper();
		p.id = "8773";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5755";
		pList.add(p);
        
		p = new Paper();
		p.id = "8763";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5756";
		pList.add(p);
        
		p = new Paper();
		p.id = "8764";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5757";
		pList.add(p);
        
		p = new Paper();
		p.id = "8760";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5758";
		pList.add(p);
        
		p = new Paper();
		p.id = "8768";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5759";
		pList.add(p);
        
		p = new Paper();
		p.id = "8767";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5760";
		pList.add(p);
        
		p = new Paper();
		p.id = "8769";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5761";
		pList.add(p);
        
		p = new Paper();
		p.id = "8765";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5762";
		pList.add(p);
        
		p = new Paper();
		p.id = "8770";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5763";
		pList.add(p);
        
		p = new Paper();
		p.id = "8761";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5764";
		pList.add(p);
        
		p = new Paper();
		p.id = "8766";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5765";
		pList.add(p);
        
		p = new Paper();
		p.id = "8774";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5766";
		pList.add(p);
        
		p = new Paper();
		p.id = "8771";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5767";
		pList.add(p);
        
		p = new Paper();
		p.id = "8762";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5768";
		pList.add(p);
        
		p = new Paper();
		p.id = "8748";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5769";
		pList.add(p);
        
		p = new Paper();
		p.id = "8749";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5770";
		pList.add(p);
        
		p = new Paper();
		p.id = "8752";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5771";
		pList.add(p);
        
		p = new Paper();
		p.id = "8751";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5772";
		pList.add(p);
        
		p = new Paper();
		p.id = "8750";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5773";
		pList.add(p);
        
		p = new Paper();
		p.id = "8747";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5774";
		pList.add(p);
        
		p = new Paper();
		p.id = "8746";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1749";
		p.exactbeginTime = "15:30";
		p.exactendTime = "17:30";
		p.presentationID = "5775";
		pList.add(p);
        
		p = new Paper();
		p.id = "8734";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Keynote";
		p.belongToSessionID = "1793";
		p.exactbeginTime = "09:30";
		p.exactendTime = "10:30";
		p.presentationID = "5776";
		pList.add(p);
        
		p = new Paper();
		p.id = "8735";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Keynote";
		p.belongToSessionID = "1781";
		p.exactbeginTime = "15:00";
		p.exactendTime = "16:00";
		p.presentationID = "5777";
		pList.add(p);
        
		p = new Paper();
		p.id = "8730";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Keynote";
		p.belongToSessionID = "1791";
		p.exactbeginTime = "09:30";
		p.exactendTime = "10:30";
		p.presentationID = "5778";
		pList.add(p);
        
		p = new Paper();
		p.id = "8733";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Keynote";
		p.belongToSessionID = "1785";
		p.exactbeginTime = "09:30";
		p.exactendTime = "10:30";
		p.presentationID = "5779";
		pList.add(p);
        
		p = new Paper();
		p.id = "8613";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1729";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5781";
		pList.add(p);
        
		p = new Paper();
		p.id = "8614";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1729";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5782";
		pList.add(p);
        
		p = new Paper();
		p.id = "8743";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1734";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5783";
		pList.add(p);
        
		p = new Paper();
		p.id = "8633";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1734";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5784";
		pList.add(p);
        
		p = new Paper();
		p.id = "8634";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1734";
		p.exactbeginTime = "15:00";
		p.exactendTime = "15:30";
		p.presentationID = "5785";
		pList.add(p);
        
		p = new Paper();
		p.id = "8680";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1745";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5797";
		pList.add(p);
        
		p = new Paper();
		p.id = "8681";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1745";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5798";
		pList.add(p);
        
		p = new Paper();
		p.id = "8694";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1752";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5799";
		pList.add(p);
        
		p = new Paper();
		p.id = "8695";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1752";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5800";
		pList.add(p);
        
		p = new Paper();
		p.id = "8741";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1742";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:10";
		p.presentationID = "5802";
		pList.add(p);
        
		p = new Paper();
		p.id = "8674";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1742";
		p.exactbeginTime = "11:10";
		p.exactendTime = "11:30";
		p.presentationID = "5803";
		pList.add(p);
        
		p = new Paper();
		p.id = "8675";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1742";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5804";
		pList.add(p);
        
		p = new Paper();
		p.id = "8676";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1742";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5805";
		pList.add(p);
        
		p = new Paper();
		p.id = "8677";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1795";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5806";
		pList.add(p);
        
		p = new Paper();
		p.id = "8744";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Presentation";
		p.belongToSessionID = "1795";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5807";
		pList.add(p);
        
		p = new Paper();
		p.id = "8719";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1777";
		p.exactbeginTime = "14:00";
		p.exactendTime = "14:30";
		p.presentationID = "5810";
		pList.add(p);
        
		p = new Paper();
		p.id = "8720";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1777";
		p.exactbeginTime = "14:30";
		p.exactendTime = "15:00";
		p.presentationID = "5811";
		pList.add(p);
        
		p = new Paper();
		p.id = "8702";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1739";
		p.exactbeginTime = "11:00";
		p.exactendTime = "11:30";
		p.presentationID = "5812";
		pList.add(p);
        
		p = new Paper();
		p.id = "8703";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1739";
		p.exactbeginTime = "11:30";
		p.exactendTime = "12:00";
		p.presentationID = "5813";
		pList.add(p);
        
		p = new Paper();
		p.id = "8704";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Full Paper";
		p.belongToSessionID = "1739";
		p.exactbeginTime = "12:00";
		p.exactendTime = "12:30";
		p.presentationID = "5814";
		pList.add(p);
        
		p = new Paper();
		p.id = "8723";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Presentation";
		p.belongToSessionID = "1765";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5815";
		pList.add(p);
        
		p = new Paper();
		p.id = "8648";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1740";
		p.exactbeginTime = "16:30";
		p.exactendTime = "17:00";
		p.presentationID = "5820";
		pList.add(p);
        
		p = new Paper();
		p.id = "8649";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1740";
		p.exactbeginTime = "17:00";
		p.exactendTime = "17:30";
		p.presentationID = "5821";
		pList.add(p);
        
		p = new Paper();
		p.id = "8650";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Full Paper";
		p.belongToSessionID = "1740";
		p.exactbeginTime = "17:30";
		p.exactendTime = "18:00";
		p.presentationID = "5822";
		pList.add(p);
        
		p = new Paper();
		p.id = "8655";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1732";
		p.exactbeginTime = "16:30";
		p.exactendTime = "17:00";
		p.presentationID = "5825";
		pList.add(p);
        
		p = new Paper();
		p.id = "8656";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1732";
		p.exactbeginTime = "17:00";
		p.exactendTime = "17:30";
		p.presentationID = "5826";
		pList.add(p);
        
		p = new Paper();
		p.id = "8657";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1732";
		p.exactbeginTime = "17:30";
		p.exactendTime = "18:00";
		p.presentationID = "5827";
		pList.add(p);
        
		p = new Paper();
		p.id = "8660";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Keynote";
		p.belongToSessionID = "1753";
		p.exactbeginTime = "16:30";
		p.exactendTime = "17:30";
		p.presentationID = "5828";
		pList.add(p);
        
		p = new Paper();
		p.id = "8740";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Discussion";
		p.belongToSessionID = "1753";
		p.exactbeginTime = "17:30";
		p.exactendTime = "18:00";
		p.presentationID = "5829";
		pList.add(p);
        
		p = new Paper();
		p.id = "8738";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5851";
		pList.add(p);
        
		p = new Paper();
		p.id = "8779";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5852";
		pList.add(p);
        
		p = new Paper();
		p.id = "8780";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5853";
		pList.add(p);
        
		p = new Paper();
		p.id = "8781";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5854";
		pList.add(p);
        
		p = new Paper();
		p.id = "8782";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5855";
		pList.add(p);
        
		p = new Paper();
		p.id = "8783";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5856";
		pList.add(p);
        
		p = new Paper();
		p.id = "8784";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5857";
		pList.add(p);
        
		p = new Paper();
		p.id = "8785";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5858";
		pList.add(p);
        
		p = new Paper();
		p.id = "8786";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5859";
		pList.add(p);
        
		p = new Paper();
		p.id = "8778";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5860";
		pList.add(p);
        
		p = new Paper();
		p.id = "8777";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5861";
		pList.add(p);
        
		p = new Paper();
		p.id = "8776";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5862";
		pList.add(p);
        
		p = new Paper();
		p.id = "8739";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5863";
		pList.add(p);
        
		p = new Paper();
		p.id = "8753";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5864";
		pList.add(p);
        
		p = new Paper();
		p.id = "8754";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5865";
		pList.add(p);
        
		p = new Paper();
		p.id = "8755";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5866";
		pList.add(p);
        
		p = new Paper();
		p.id = "8756";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5867";
		pList.add(p);
        
		p = new Paper();
		p.id = "8757";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5868";
		pList.add(p);
        
		p = new Paper();
		p.id = "8758";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5869";
		pList.add(p);
        
		p = new Paper();
		p.id = "8759";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5870";
		pList.add(p);
        
		p = new Paper();
		p.id = "8787";
		p.date = "Thursday, September 5";
		p.day_id = "3";
		p.type = "Poster / Demo";
		p.belongToSessionID = "1768";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5871";
		pList.add(p);
        
		p = new Paper();
		p.id = "8745";
		p.date = "Friday, September 6";
		p.day_id = "4";
		p.type = "Workshop";
		p.belongToSessionID = "1762";
		p.exactbeginTime = "14:00";
		p.exactendTime = "15:00";
		p.presentationID = "5872";
		pList.add(p);
        
		p = new Paper();
		p.id = "8673";
		p.date = "Wednesday, September 4";
		p.day_id = "2";
		p.type = "Presentation";
		p.belongToSessionID = "1787";
		p.exactbeginTime = "09:00";
		p.exactendTime = "09:30";
		p.presentationID = "5873";
		pList.add(p);
        
        
        
		return pList;
	}
	public ArrayList<PaperContent> loadPaperContents(){
		ArrayList<PaperContent> pList = new ArrayList<PaperContent>();
		PaperContent p;
		
		p = new PaperContent();
		p.id = "8603";
		p.type = "Full Paper";
		p.authors = "Nguyen Trung Hieu, Mario Di Francesco, Antti Ylä-Jääski";
		p.title = "Extracting Knowledge from Wikipedia Articles through Distributed Semantic Analysis";
		p.paperAbstract = "<p style='text-align: justify;'>Computing semantic word similarity and relatedness requires access to vast amounts of semantic space for effective analysis. As a consequence, it is time-consuming to extract useful information from a large amount of data on a single workstation. In this paper, we propose a system, called Distributed Semantic Analysis (DSA), that integrates a distributed-based approach with semantic analysis. DSA builds a list of concept vectors associated with each word by exploiting the knowledge provided by Wikipedia articles. Based on such lists, DSA calculates the degree of semantic relatedness between two words through the cosine measure. The proposed solution is built on top of the Hadoop MapReduce framework and the Mahout machine learning library. Experimental results show two major improvements over the state of the art, with particular reference to the Explicit Semantic Analysis method. First, our distributed approach significantly reduces the computation time to build the concept vectors, thus enabling the use of larger inputs that is the basis for more accurate results. Second, DSA obtains a very high correlation of computed relatedness with reference benchmarks derived by human judgements. Moreover, its accuracy is higher than solutions reported in the literature over multiple benchmarks.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8604";
		p.type = "Full Paper";
		p.authors = "Stefan Zwicklbauer, Christin Seifert, Michael Granitzer";
		p.title = "Do We Need Entity-Centric  Knowledge Bases for Entity  Disambiguation? ";
		p.paperAbstract = "<p style='text-align: justify;'>Entity Disambiguation has been studied extensively in the last 10 years with authors reporting increasingly well performing systems. However, most studies focused on general purpose knowledge bases like Wikipedia or DBPedia and left out the question how those results generalize to more specialized domains. This is especially important in the context of Linked Open Data which forms an enormous resource for disambiguation. However, the influence of domain heterogeneity, size and quality of the knowledge base remains largely unanswered. In this paper we present an extensive set of experiments on special purpose knowledge bases from the biomedical domain where we evaluate the disambiguation performance along four variables: (i) the representation of the knowledge base as being either entity-centric or document-centric, (ii) the size of the knowledge base in terms of entities covered, (iii) the semantic heterogeneity of a domain and (iv) the quality and completeness of a knowledge base. Our results show that for special purpose knowledge bases (i) document-centric disambiguation significantly outperforms entity-centric disambiguation, (ii) document-centric disambiguation does not depend on the size of the knowledge-base, while entity-centric approaches do, and (iii) disambiguation performance varies greatly across domains. These results suggest that domain-heterogeneity, size and knowledge base quality have to be carefully considered for the design of entity disambiguation systems and that for constructing knowledge bases user-annotated texts are preferable to carefully constructed knowledge bases.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8605";
		p.type = "Full Paper";
		p.authors = "Alessio Palmero Aprosio, Claudio Giuliano, Alberto Lavelli";
		p.title = "Automatic Mapping of  Wikipedia Templates for Fast  Deployment of Localized  DBpedia Datasets ";
		p.paperAbstract = "<p style='text-align: justify;'>DBpedia is a Semantic Web resource that aims at representing Wikipedia in RDF triples. Due to the large and growing number of resources linked to it, DBpedia has become central for the Semantic Web community. The English version currently covers around 1.7M Wikipedia pages. However, the English Wikipedia contains almost 4M pages. This means that there is a substantial problem of coverage (even bigger in other languages). The coverage slowly increases thanks to the manual effort made by various local communities. This effort is aimed at manually mapping Wikipedia templates into DBpedia ontology classes and then run the open-source software provided by the DBpedia community to extract the triples. In this paper, we present an approach to automatically map templates and we release the resulting resource in 25 languages. We describe the used algorithm, starting from the existing mappings on other languages and extending them using the cross-lingual information available in Wikipedia. We evaluate our system on the mappings of a set of languages already included in DBpedia (but not used during the training phase), demonstrating that our approach can replicate the human mappings with high precision and recall, and producing an additional set of mappings not included in the original DBpedia.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8606";
		p.type = "Keynote";
		p.authors = "Klaus Tochtermann";
		p.title = "Keynote";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8607";
		p.type = "Full Paper";
		p.authors = "Gonzalo Parra, Joris Klerkx, Erik Duval";
		p.title = "TiNYARM: Awareness  of Research Papers in a  Community of Practice ";
		p.paperAbstract = "<p style='text-align: justify;'>Reading scientific papers is a core research activity, and helps researchers to be aware of fundamental contributions and latest trends. However, the exponential growth of scientific literature increases the complexity of evaluating what is relevant to read and why. To research how this issue can be tackled, we designed, implemented, and evaluated TiNYARM, a Science 2.0 web-based tool that leverages a social network approach to make researchers aware of what their peers are reading. We investigate how activity streams, Personal Information Management, and Gamification concepts can be leveraged to support awareness, increase collaboration, and engage users. We present an evaluation of our approach with different communities, including students with no research experience, early stage researchers, and experienced researchers. Each group found certain system aspects more relevant.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8608";
		p.type = "Full Paper";
		p.authors = "Marta Sabou, Kalina Bontcheva, Michael Föls";
		p.title = "Games with a Purpose or  Mechanised Labour?  A Comparative Study ";
		p.paperAbstract = "<p style='text-align: justify;'>Mechanised labour and games with a purpose are the two most popular human computation genres, frequently employed to support research activities in fields as diverse as natural language processing, semantic web or databases. Research projects typically rely on either one or the other of these genres, and therefore there is a general lack of understanding of how these two genres compare and whether and how they could be used together to offset their respective weaknesses. This paper addresses these open questions. It first identifies the differences between the two genres, primarily in terms of cost, speed and result quality, based on existing studies in the literature. Secondly, it reports on a comparative study which involves performing the same task through both genres and comparing the results. The study’s findings demonstrate that the two genres are highly complementary, which not only makes them suitable for different types of projects, but also opens new opportunities for building cross-genre human computation solutions that exploit the strengths of both genres simultaneously.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8609";
		p.type = "Full Paper";
		p.authors = "Jose Mora, Oscar Corcho";
		p.title = "Engineering Optimisations in Query Rewriting for OBDA";
		p.paperAbstract = "<p style='text-align: justify;'>Ontology-based data access (OBDA) systems use ontologies to provide views over relational databases. Most of these systems work with ontologies implemented in description logic families of reduced expressiveness, what allows applying efficient query rewriting techniques for query answering. In this paper we describe a set of optimisations that are applicable with one of the most expressive families used in this context (ELHIO¬ ). Our resulting system exhibits a behaviour that is comparable to the one shown by systems that handle less expressive logics.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8610";
		p.type = "Full Paper";
		p.authors = "Kovalenko Olga, Estefania Serral, Stefan Biffl";
		p.title = "Towards Evaluation and Comparison of Tools for Ontology Population from Spreadsheet Data";
		p.paperAbstract = "<p style='text-align: justify;'>Semantic Web technologies and ontologies increasingly provide mission-critical capabilities for a variety of applications, not only in the Web, but also in industry projects to facilitate semantic integration and interoperability between heterogeneous systems. Due to this proliferation in the use of ontologies, technologies and tools have been developed to facilitate the ontology engineering process and ontology population, as a part of this process. As spreadsheets are widely used to store and exchange data, academia and industry have developed a range of tools and mapping techniques to support the (semi-)automated translation of spreadsheet data into OWL/RDF. Existing tools vary in many aspects, therefore it can be difficult to select tool that fits best for a specific usage context. In this paper we analyzed several types of end users, which could be interested to apply such tools in their workflow, and their specific needs. Based on this analysis we propose an evaluation framework that could facilitate tools comparison; and c) search for an appropriate tool for a specific task/problem. In order to validate the proposed evaluation framework, a qualitative analysis of a set of six tools for ontology population has been performed.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8611";
		p.type = "Full Paper";
		p.authors = "Judie Attard, Simon Scerri, Ismael Rivera, Siegfried Handschuh";
		p.title = "Ontology-Based Situation Recognition for Context-Aware Systems";
		p.paperAbstract = "<p style='text-align: justify;'>Today’s personal devices provide a stream of information which, if processed adequately, can provide a better insight into their owner’s current activities, environment, location, etc. In treating these devices as part of a personal sensor network, we exploit raw and interpreted context information in order to enable the automatic recognition of personal recurring situations. An ontology-based graph matching technique continuously compares a person’s ‘live context’, with all previously-stored situations, both of which are represented as an instance of the DCON Context Ontology. Whereas each situation corresponds to an adaptive DCON instance, initially marked by a person and gradually characterised over time, the live context representation is constantly updated with mashed-up context information streaming in from various personal sensors. In this paper we present the matching technique employed to enable automatic situation recognition, and an experiment to evaluate its performance based on real users and their perceived context data.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8613";
		p.type = "Presentation";
		p.authors = "Johann Nyikos";
		p.title = "Zukünftige Anforderungen des Low Voltage – Grids an die IT";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8614";
		p.type = "Presentation";
		p.authors = "Lothar Fickert";
		p.title = "Smart Grids: Eine Perspektive aus der Forschung";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8615";
		p.type = "Presentation";
		p.authors = "Anneliese Breitner";
		p.title = "Social Knows ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8616";
		p.type = "Presentation";
		p.authors = "Birgit Gobi";
		p.title = "OneHP – Knowledge Management &amp; Social Networking bei HP weltweit";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8617";
		p.type = "Presentation";
		p.authors = "Manfred Koch";
		p.title = "Social Intranet der Raiffeisen Bank International (Head Office) ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8618";
		p.type = "Presentation";
		p.authors = "Hans Ramaker";
		p.title = "Performance Support @  Philips Lightning University ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8620";
		p.type = "Presentation";
		p.authors = "Michael Wetzel";
		p.title = "Language Meets Knowledge - How to Achieve Cross-Border Interoperability";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8621";
		p.type = "Presentation";
		p.authors = "Angela Fessl, Gudrun Wesiak, Marina Bratic, Granit Luzhnica";
		p.title = "The MIRROR User Profile: A Concept for App-Independent User Modelling and Support";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8622";
		p.type = "Poster / Demo";
		p.authors = "Ronald Denaux, Claudia Hauff, Dhavalkumar Thakker, Lucia Pannese, Declan Dagger, Vania Dimitrova, Geert-Jan Houben";
		p.title = "Modelling User Cultural Exposure Utilising Social and Linked Data";
		p.paperAbstract = "<p style='text-align: justify;'>People with good intercultural skills are becoming crucial for the success of businesses due to increased globalisation, which translates into a higher demand for cross-cultural e-learning solutions such as training simulators. However, in order to adapt to learners, such e-learning tools require an initial assessment of the learners current intercultural awareness – a form of the well-known “cold-start” problem in user modelling. We present our experiences using semantic web technologies during the design, development and deployment of a set of services to tackle this problem. The services employ a hybrid approach including (a) social sensors about the user’s cultural exposure based on their content in Flickr and Twitter and (b) an interactive dialogue with the learner based on culturally relevant facts extracted from DBPedia. Thus, we first derive a set of user attributes fully automatically and then rely on the dialogue to verify them.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8623";
		p.type = "Poster / Demo";
		p.authors = "Lydia Lau, Vania Dimitrova, Dhaval Thakker, Dimoklis Despotakis";
		p.title = "Semantically-enriched Intelligent Support to Make Sense of User Generated Content";
		p.paperAbstract = "<p style='text-align: justify;'>Trends and predictions point out that social media will have a strong impact on learning in both the workplace, providing a huge resource of user-generated content for  learning that is unplanned and often driven by circumstances – i.e. informal learning. We will demonstrate two services developed within the EU FP7 ImREAL (Immersive Reflective Experience-based Adaptive Learning) project to enable instruction designers, teachers and learners to benefit from the diversity of experiences captured in user generated content (UGC) from social media (e.g. text-based content which exists in comments on videos, blogs, microposts): (i) an exploratory search environment for a user to deepen one’s awareness of the richness and diversity of views on a knowledge item; and (ii) a visualization tool, in the form of semantic maps, for a user to explore the diversity among individual or group viewpoints qualitatively.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8624";
		p.type = "Full Paper";
		p.authors = "Elitsa Alexander, Martin J. Eppler, Sabrina Bresciani";
		p.title = "Knowledge Scaffolding: A Classification of Visual Structures for Knowledge Communication in Teams";
		p.paperAbstract = "<p style='text-align: justify;'>In this conceptual paper we develop Wanda Orlikowski’s [1] idea of considering the distinguishing characteristics of physical scaffolds as a metaphor to offer insights into how knowledge in practice is materially scaffolded. We build on an interdisciplinary analogy between two connotations of the notion of “scaffolding”: physical scaffolding from an architectural-engineering perspective and scaffolding of the “everyday knowing in practice” from a knowledge management perspective. Based on that, we classify visual structures for knowledge communication in teams into four types of scaffolds: grounded (corresponding i.e., to perspectives diagrams or dynamic facilitation diagrams), suspended (i.e., negotiation sketches), panel (i.e., roadmaps or timelines) and reinforcing (i.e., a visual domain glossary). The article concludes with a set of recommendations in the form of questions to ask whenever practitioners are making choices regarding which types of visual structures should be used for specific knowledge communication needs. Our recommendations aim at providing a framework at a broad-brush level to aid choosing a suitable visualization template depending on the type of knowledge management endeavor.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8625";
		p.type = "Full Paper";
		p.authors = "Marius Brade, Florian Schneider, Angelika Salmen, Rainer Groh";
		p.title = "OntoSketch: Towards Digital  Sketching as a Tool for  Creating and Extending  Ontologies for Non-Experts ";
		p.paperAbstract = "<p style='text-align: justify;'>This paper introduces a sketch-based interaction concept called OntoSketch, enabling non-experts to create and extend formally represented knowledge. Contrary to current editors, OntoSketch is based on lightweight pen and paper-like interactions, including a visual vocabulary that supports non-experts in modeling knowledge about specific domain information. The visualization concept is based on previous work as well as insights from a user study with 20 participants. OntoSketch enables the user to work in three views with his data: created domain examples, related or emerging abstract concepts and a combination of both. This allows for reflection while creating formalized knowledge. An export function allows a non-expert to generate an ontology out of his sketch-based work, without the necessity to understand the concept of ontologies in detail. Our approach is demonstrated via a prototypical tablet-PC application.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8626";
		p.type = "Full Paper";
		p.authors = "Peter Bodesinsky, Paolo Federico, Silvia Miksch";
		p.title = "Visual Analysis of Compliance  with Clinical Guidelines ";
		p.paperAbstract = "<p style='text-align: justify;'>Clinical guidelines provide recommendations in the form of applicable actions in a specific clinical context. Computer Interpretable Guidelines (CIG) aim to achieve guideline integration into clinical practice to increase health care quality. Analyzing the compliance with a CIG can facilitate the implementation and assist in the design of CIGs, but to help medical experts in the detection of patterns in the wealth of the data is a challenging task. We suggest an approach based on visual analytics, intertwining interactive visualization and automated data analysis i.e. analysis of compliance with a CIG. Our solution covers highlighting and abstraction for time-oriented patient parameters, and aggregation of repeatedly missing actions into intervals; in addition valid, invalid, and missing actions are represented visually. Furthermore, we discuss a case study showing how the applied techniques can assist in the detection of interesting patterns.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8627";
		p.type = "Full Paper";
		p.authors = "Daniel Bahls, Benjamin Zapliko, Klaus Tochtermann";
		p.title = "A Data Restore Model for Reproducibility in Computational Statistics";
		p.paperAbstract = "<p style='text-align: justify;'>Researchers are more and more requested to publish their scientific data sets for purposes of transparency, re-use, and reproducibility. Particularly in economics and the social sciences, researchers often use sensitive statistical data that underlie protection policies which inhibit distribution to third party archives. In addition, a considerable quantity of data sets combines data from one or more external providers, which complicates the setting for curation-related activities. These circumstances give us reason to pursue a data restore model on the basis of fine-grained referencing that allows to trace data provenance to the original archive in charge of curation. One goal is to enable data publication in difficult cases, and another one is to show how the gaps between data citation and code integration can be closed in order to eliminate all manual efforts of arranging code and data files for reproduction attempts. On this basis we develop the requirements for a data restore model and elaborate a generic design in view of an overall data management infrastructure. We further explore an experimental implementation which we validate by taking the example of a real-world publication in economics. Eventually we close with the vision of a data and code ontology that carries statistical models from paper to a re-usable semantic level.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8628";
		p.type = "Full Paper";
		p.authors = "Sebastian Dennerlein, Robert Gutounig, Peter Kraker, Rene Kaiser, Romana Rauter, Julian Ausserhofer";
		p.title = "Assessing Barcamps: Incentives for Participation in Ad-Hoc Conferences and the Role of Social Media";
		p.paperAbstract = "<p style='text-align: justify;'>Barcamps are informal conferences whose content is not defined in advance, often referred to as ad-hoc conferences or un-conferences. Therefore, the outcomes of a barcamp are largely unknown before the event. This raises the question of the participants’ motivations to attend and contribute. To answer this question, we conducted an exploratory empirical study at Barcamp Graz 2012. We applied a mixed-method approach: first we used a socio-demographic questionnaire (n=99) which allowed us to characterize the ’typical barcamper’. Second, we conducted qualitative interviews (n=10) to get a deeper understanding of the participants’ motivations to attend, expectations, and the use of social media in that context. We identified three concepts, which could be deducted from the interviews: people, format and topics. We found that the motivation to attend and even a common identity is quite strongly based on these three factors. Furthermore, the results indicate that participants share a set of activities and methods by following the barcamp’s inherent rules and make extensive use of social media.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8629";
		p.type = "Full Paper";
		p.authors = "Christian Hentschel, Ina Blümel, Harald Sack";
		p.title = "Automatic Annotation of Scientific Video Material based on Visual Concept Detection";
		p.paperAbstract = "<p style='text-align: justify;'>Rapid growth of today’s video archives along with sparsely available editorial metadata and too few capacities of libraries and archives for manual annotation demand for efficient approaches of automated metadata extraction. In addition, editorial and non-authoritative metadata is usually not fine-grained enough to describe video on a segment level, which is often required for efficient pinpoint search and retrieval. We consider the use case of the AV Portal provided by the German National Library of Science and Technology – a web based video search engine that offers access to educational video content from various areas of engineering and natural sciences. User studies that have been conducted during the conceptional design stage of the AV Portal have indicated a strong interest of potential users to search for specific visual concepts, like e.g. “landscape”, “drawing”, “animation”, within videos of a particular domain. We present an approach that supports automatic content-based classification of video segments that is tailored to the special requirements of the AV Portal regarding its technology oriented content and academic users. We furthermore show that semantic analysis of the generated metadata not only allows for better retrieval goal definition but also offers explorative search within the archive using visual concepts.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8630";
		p.type = "Full Paper";
		p.authors = "Fajar J. Ekaputra, Estefanía Serral, Dietmar Winkler, Stefan Biffl";
		p.title = "An Analysis Framework for Ontology Querying Tools";
		p.paperAbstract = "<p style='text-align: justify;'>While knowledge querying is a key capability of ontologies, the query language recommended by W3C, SPARQL, is not easy to use for some user types, e.g., casual users and domain experts. To improve this drawback, user-friendly Ontology Query Tools (OQTs) have been introduced. However, there is, to our knowledge, no comprehensive framework for researchers and practitioners to compare the capabilities of the wide range of available OQTs. In this paper we introduce, based on a systematic literature review, a framework that allows researchers and practitioners to classify and compare OQTs regarding their capabilities and their support for relevant user types and scenarios. We evaluate the framework based on a real-world use case. Major result of the evaluation was that the framework was found useful and usable by users from the target audience to identify the most suitable OQTs for their context.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8631";
		p.type = "Full Paper";
		p.authors = "Alessandro Adamou, Paolo Ciancarini, Aldo Gangemi, Valentina Presutti";
		p.title = "The Foundations of Virtual  Ontology Networks ";
		p.paperAbstract = "<p style='text-align: justify;'>The notion of ontology network is relatively recent and rooted in the field of knowledge engineering. It concerns those ontology networks assembled at design time and established by their authors. Nowadays, however, the need to deal with heterogeneous semantic data sources, such as Linked Data and reengineered resources, gives rise to new use cases: ontologies now also need to be selected and combined in ways that were unpredictable at design time. This process is non-trivial and error-prone: if improperly dealt with, it can lead to loss of expressivity when interpreting resources (e.g. RDF graphs) as ontologies. Previous attempts at formally representing ontology relations assumed a controlled environment where axioms are unequivocally determined, and as such did not need to capture this distinction and its creeping issues. One possible solution is to assemble ontology networks at runtime by mimicking part of the design-time process; however, this requires that the difference between ontology networks assembled statically by their authors, and dynamically by consumer agents, be formally represented. The notion of virtual ontology network introduced here establishes this distinction. In this paper, we provide the theoretical underpinnings of virtual ontology network management. We define the representational primitives and abstract relationships that virtual networks are constructed upon. To validate the theory and demonstrate the feasibility of virtualization in contemporary ontology management, we show that this formal framework is compatible with the existing theory of ontology relations. To that end, we illustrate which constructs from existing representation languages can be used to implement the relations that characterize a virtual ontology network. We show this both in OWL 2 and with E-connections. This paper is a prelude to actual virtualization methods that we have devised and implemented: the finalization of their evaluation is underway and will be presented as a follow-up to the work presented herein.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8632";
		p.type = "Full Paper";
		p.authors = "Stefan Negru, Florian Haag, Steffen Lohmann";
		p.title = "Towards a Unified Visual Notation for OWL Ontologies: Insights from a Comparative User Study";
		p.paperAbstract = "<p style='text-align: justify;'>Browsing ontologies and making sense of their concepts and relationships are important activities in knowledge engineering. They are supported by a large number of tools that often provide visual representations of the ontologies for better illustration. However, different notations are used to represent the ontologies which can be confusing when switching tools. Furthermore, many representations provide only basic overviews of the ontologies that are not sufficient to get a deeper understanding of the concepts and relationships. A unified visual notation for OWL ontologies would be most helpful to overcome these limitations. Having this goal in mind, we compare two different notations for OWL ontologies in this paper: the UML profile of the Ontology Definition Metamodel (ODM) and the Visual Notation for OWL Ontologies (VOWL). We report on a comparative user study of these notations and discuss benefits and limitations raised by the study participants. Based on these findings, we draw some general conclusions regarding the development of a unified visual notation for OWL ontologies.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8633";
		p.type = "Presentation";
		p.authors = "Jesper Grönbaek";
		p.title = "Networked Data im Smart  Grid Context ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8634";
		p.type = "Presentation";
		p.authors = "Friederich Kupzog";
		p.title = "ICT Challenges in Smart Grids - Lessons Learned from Field Trials ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8635";
		p.type = "Presentation";
		p.authors = "Mike Heininger";
		p.title = "Öffentliche Q&amp;A Plattformen - Chancen und Risiken beim Einsatz in Organisationen ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8636";
		p.type = "Presentation";
		p.authors = "Gerald Berger";
		p.title = "Was man als Unternehmen über Facebook wissen muss!";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8637";
		p.type = "Presentation";
		p.authors = "Andreas Koller";
		p.title = "Wikis in Unternehmen -  Nutzen und Anwendungen";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8638";
		p.type = "Keynote";
		p.authors = "Werner Schachner, Alexander Stumpfegger";
		p.title = "Keynote: Knowledge Management im Einsatz für Competitive Intelligence - Relevante Informationen intelligent finden und analysieren ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8639";
		p.type = "Presentation";
		p.authors = "Moises Martinez-Abl Anedo";
		p.title = "An Innovative Product Data Management Approach Based on Semantic Vectors";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8640";
		p.type = "Presentation";
		p.authors = "Quentin Reul";
		p.title = "How does Linked Data change the publishing landscape?";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8641";
		p.type = "Presentation";
		p.authors = "John Cook, Sebastian Dennerlein, Milos Kravcik, Christine Kunzmann, Mart Laanpere, Kai Pata, Jukka Purma, John Sandars, Patricia Santos, Andreas Schmidt";
		p.title = "Scaling Informal Learning: An Integrative Systems View on Scaffolding at the Workplace";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8642";
		p.type = "Presentation";
		p.authors = "Angela Fessl, Marina Bratic, Sandra Feyertag, Gudrun Wesiak";
		p.title = "The MIRROR Reflection Guidance Concept for Automatic Support of Individual Reflective Learning";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8643";
		p.type = "Presentation";
		p.authors = "Alexander Nussbaumer, Milos Kravcik, Dietrich Albert";
		p.title = "Supporting Self-Regulated Learning in Personal Learning Environments";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8644";
		p.type = "Full Paper";
		p.authors = "Hans-Jörg Schulz, Steffen Hadlak, Heidrun Schumann";
		p.title = "A Visualization Approach for Cross-level Exploration of Spatiotemporal Data";
		p.paperAbstract = "<p style='text-align: justify;'>Spatiotemporal data often relates to different levels of granularity in space, time, and data. Yet, bringing these levels together for an integrated visual exploration across levels poses a challenge up to this day. With this paper, we aim to provide a first solution approach to this challenge, which decomposes the data in its various levels to be able to show them side-by-side. Based on this decomposition, we derive a visual exploration approach that consists of a novel multilevel visualization, adjoined traditional spatial and temporal views, as well as of tailored exploration techniques for their concerted use. We exemplify the utility of this approach by case studies on election and poll data from Germany’s various administrative levels and different time spans.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8647";
		p.type = "Full Paper";
		p.authors = "Alexander Stocker, Johannes Mueller";
		p.title = "Exploring Factual and Perceived Use and Benefits of a Web 2.0-Based Knowledge Management Application: The Siemens Case References+";
		p.paperAbstract = "<p style='text-align: justify;'>References+ is a business-related Web 2.0-based application designed to facilitate the worldwide sharing of knowledge, experiences, and best practices on the Siemens intranet. The underlying knowledge management approach has a strong focus on the user community, which currently comprises approximately 10,000 registered members located in more than 75 countries. To measure the individually perceived benefits generated by References+, a user survey was performed in 2011. This paper not only evaluates the survey results received from nearly 1,500 respondents, but also detects and discusses any correlations to factual use and contribution behavior measured by an evaluation of the respondents’ system usage statistics. This allows a first attempt to explore the potential of a combination of perceived use and benefits (as measured by the user survey) with factual use (as measured by the corresponding usage statistics). As an important finding of this research, it was observed that higher perceived benefits correlate with usage frequency and the number of viewed contributions. The correlation is less strong regarding average contribution activity and for some cases ambiguous regarding the number of followers. Furthermore, it can be reported that in general a higher perceived use is also reflected in a higher factual use and in a higher number of followers.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8648";
		p.type = "Full Paper";
		p.authors = "Amapali Zaveri, Dimitris Kontokostas, Mohamed Sherif, Lorenz Bühmann, Mohamed Morsey, Sören Auer, Jens Lehmann";
		p.title = "User-driven Quality Evaluation of DBpedia ";
		p.paperAbstract = "<p style='text-align: justify;'>Linked Open Data (LOD) comprises of an unprecedented volume of structured datasets on the Web. However, these datasets are of varying quality ranging from extensively curated datasets to crowdsourced and even extracted data of relatively low quality. We present a methodology for assessing the quality of linked data resources, which comprises ofa manual and a semi-automatic process. The first phase includes the detection of common quality problems and their representation in a quality problem taxonomy. In the manual process, the second phase comprises of the evaluation of a large number of individual resources, according to the quality problem taxonomy via crowdsourcing. This process is accompanied by a tool wherein a user assesses an individual resource and evaluates each fact for correctness. The semi-automatic process involves the generation and verification of schema axioms. We report the results obtained by applying this methodology to DBpedia. We identified 17 data quality problem types and 58 users assessed a total of 521 resources. Overall, 11.93% of the evaluated DBpedia triples were identified to have some quality issues. Applying the semi-automatic component yielded a total of 222,982 triples that have a high probability to be incorrect. In particular, we found that problems such as object values being incorrectly extracted, irrelevant extraction of information and broken links were the most recurring quality problems. With this study, we not only aim to assess the quality of this sample of DBpedia resources but also adopt an agile methodology to improve the quality in future versions by regularly providing feedback to the DBpedia maintainers.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8649";
		p.type = "Full Paper";
		p.authors = "Javier Fabra, Sergio Hernandez, Estefania Otero, Juan Carlos Vidal, Manuel Lama, Pedro Álvarez";
		p.title = "A Practical Experience Concerning the Parallel Semantic Annotation of a Large-Scale Data Collection ";
		p.paperAbstract = "<p style='text-align: justify;'>From a computational point of view, the semantic annotation of large-scale data collections is an extremely expensive task. One possible way of dealing with this drawback is to distribute the execution of the annotation algorithm in several computing environments. In this paper, we show how the problem of semantically annotating a large-scale collection of learning objects has been conducted. The terms related to each learning object have been processed. The output was an RDF graph computed from the DBpedia database. According to an initial study, the use of a sequential implementation of the annotation algorithm would require more than 1600 CPU-years to deal with the whole set of learning objects (about 15 millions). For this reason, a framework able to integrate a set of heterogeneous computing infrastructures has been used to execute a new parallel version of the algorithm. As a result, the problem was solved in 178 days.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8650";
		p.type = "Full Paper";
		p.authors = "Joachim Daiber, Max Jakob, Chris Hokamp, Pablo N. Mendes";
		p.title = "Improving Efficiency and Accuracy in Multilingual Entity Extraction";
		p.paperAbstract = "<p style='text-align: justify;'>There has recently been an increased interest in named entity recognition and disambiguation systems at major conferences such as WWW, SIGIR, ACL, KDD, etc. However, most work has focused on algorithms and evaluations, leaving little space for implementation details. In this paper, we discuss some implementation and data processing challenges we encountered while developing a new multilingual version of DBpedia Spotlight that is faster, more accurate and easier to configure. We compare our solution to the previous system, considering time performance, space requirements and accuracy in the context of the Dutch and English languages. Additionally, we report results for 7 additional languages among the largest Wikipedias. Finally, we present challenges and experiences to foment the discussion with other developers interested in recognition and disambiguation of entities in natural language text.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8653";
		p.type = "Workshop";
		p.authors = "Christina M. Steiner, Gudrun Wesiak, Dietrich Albert";
		p.title = "Evaluation in ImREAL: Lessons Learned from a Project on Augmenting Experiential Training Simulators";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8655";
		p.type = "Presentation";
		p.authors = "Kai Holzweißig";
		p.title = "Linked Data in Product Development ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8656";
		p.type = "Presentation";
		p.authors = "Sebastian Peneder";
		p.title = "Collection of Lessons Learned with Web 2.0 Technologies";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8657";
		p.type = "Presentation";
		p.authors = "Silke Retzer";
		p.title = "SAP Goes Social";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8658";
		p.type = "Presentation";
		p.authors = "Thomas Natschläger";
		p.title = "Data Analytics for Energy Applications";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8660";
		p.type = "Keynote";
		p.authors = "Ralf Klamma";
		p.title = "Keynote: Supporting Professional Communities in the Next Web (16.30 – 17.30) ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8661";
		p.type = "Presentation";
		p.authors = "Eva Hillemann, Alexander Nussbaumer, Christina M. Steiner, Dietrich Albert";
		p.title = "Equalia – An Evaluation Service in the Application Context of Technology- Enhanced Learning";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8662";
		p.type = "Presentation";
		p.authors = "Marina Bratic, Gudrun Wesiak, Angela Fessl";
		p.title = "Evaluating the Effectiveness of Reflective Learning at Work";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8663";
		p.type = "Full Paper";
		p.authors = "Christina Bülow, Johannes Metscher, Jan-Mathis Schnurr, Michael Koch";
		p.title = "Shaping a Social Software for a Distributed Military Organisation";
		p.paperAbstract = "<p style='text-align: justify;'>While the deployment of social software has become widespread in private enterprises in the past years, the usage in military institutions is not common practice yet. This paper documents the implementation and usage of a social networking service in the medical service of the German armed forces – the San-Netz. The case study documents the whole process from a user needs analysis, which took place in two waves of interviews in 2011 and 2012, to conceptualization, development and rollout of the social networking service. Analysis shows several challenges for platform adoption, which stem from the socio-technical context. The paper details possible solutions for these challenges. One proposed solution that is discussed in details is the employment of use-case-centred documentation.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8664";
		p.type = "Full Paper";
		p.authors = "Franz Lehner, Nora Fteimi";
		p.title = "Organize, Socialize, Benefit - How Social Media Applications Impact Enterprise Success and Performance";
		p.paperAbstract = "<p style='text-align: justify;'>In recent years, social web applications like Twitter, Facebook and Instant Messaging services have gained in importance, not only for private persons, but also for business. Using these applications enables users amongst others to communicate and share information with other people. Numerous studies have investigated how social media contributes to enterprise success or performance. Based on a systematic literature review, this paper presents and critically reflects the state of the art of scientific studies analyzing these effects, especially in business context. In the paper the attempt is made to answer the following questions: - which constructs, models or views are used to measure the success and can we see a convergence? - Are the theories and research methods that were used sound, and in accordance to the state of the art within this research field? Based upon the findings, a classification schema will be suggested that allows categorizing, comparing and integrating partial or isolated findings in a general business context.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8665";
		p.type = "Full Paper";
		p.authors = "Felix Mödritscher, Monika Andergassen, Gustaf Neumann";
		p.title = "Dependencies between E-Learning Usage Patterns and Learning Results";
		p.paperAbstract = "<p style='text-align: justify;'>Recent studies come to the conclusion that Learning Management System (LMS) usage variables explain a higher variation in students’ final grades than traditional student characteristics. Referring to such findings from literature our research aims at exploring dependencies between e-learning usage patterns and achieved learning results on the basis of LMS log-files from courses in different knowledge domains, and by analyzing courses not in isolation but by taking potential dependencies with students’ activities in other courses into account. We examine correlations between usage variables and the students’ performance in three blended learning courses with different topics based on large cohorts of students (n=883, n=389, n=578). In this context, an extended set of variables, including LMS usage beyond the three courses and usage patterns of students, are examined for interdependencies. Our results indicate that specific indicators, such as the number of active learning days and topic views, have a positive influence on learning results. In general, they show that at-risk students can be differentiated from well-performing students by their usage behavior. Moreover, we try to identify some significant patterns of LMS usage amongst the students. The paper shows how these patterns differ in our observations depending on the course domains.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8666";
		p.type = "Short Paper";
		p.authors = "Tanja Bergmann, Stefan Bunk, Johannes Eschrig, Christian Hentschel, Magnus Knuth, Harald Sack, Ricarda Schueler";
		p.title = "Generating a Linked Soccer Dataset (11.00 – 11.20)";
		p.paperAbstract = "<p style='text-align: justify;'>The provision of Linked Data about sporting results enables extensive statistics, while connections to further datasets allow enhanced and sophisticated analyses. Moreover, providing sports data as Linked Open Data may promote new applications, which are currently impossible due to the locked nature of today’s proprietary sports databases. Though the sport domain is strongly underrepresented in the Linked Open Data Cloud. In this paper we present a dataset containing information about soccer entities crawled from heterogeneous sources and linked to related entities from the LOD cloud. To enable easy exploration and to illustrate the capabilities of the dataset a web interface is providing a structured overview and extensive statistics.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8667";
		p.type = "Short Paper";
		p.authors = "Tayfun Gokmen Halac and Oguz Dikenelli, Bahtiyar Erden, Emrah Inan, Damla Oguz, Pinar Gocebe, Tayfun Gokmen Halac and Oguz Dikenelli";
		p.title = "Publishing and Linking University Data Considering the Dynamism of Datasources (11.20 – 11.40)";
		p.paperAbstract = "<p style='text-align: justify;'>University organizations require many different software systems such as student information management system, library system, research project management software, course material management, geographical maps, and so on. These applications are generally developed by different vendors, and thus university data is stored in databases of different applications in a separated manner. University administration requires integrated university data to turn that data into knowledge for decision-making processes. However, integrating systems with traditional methods such as web services causes development and maintenance costs. For this reason, in Ege University, we benefit from linked data to integrate data distributed in different software systems. Data in different databases is published using general vocabularies, and related contents in different databases are linked to each other. In this paper, we introduce the evolution of the architecture of our linked university data, and a university assistant application developed on this integrated data.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8668";
		p.type = "Short Paper";
		p.authors = "Michalis Vafopoulos, Marios Meimaris, Jose María Álvarez Rodríguez, Ioannis Xidias, Michael Klonaras, George Vafeiadis";
		p.title = "Insights in Global Public Spending (11.40 – 12.00)";
		p.paperAbstract = "<p style='text-align: justify;'>Governments around the globe are opening up public spending data in order to promote transparency and citizen awareness. However, data openness by itself is not enough to guarantee that the data is consumed efficiently and in meaningful ways. In this work public spending data from seven governments, both local and national, with total value almost 1,5 trillion euro, are processed, cleansed and converted to Linked Open Data, following best practices. Namely, the cases of Greece, the UK, the US federal government, Australia, the city of Chicago and the states of Alaska and Massachusetts are considered. Furthermore, the resulting Linked Data are interlinked with external resources and made accessible on a public SPARQL endpoint. A web portal application with several functionalities is deployed in order to make the data mashups understandable and easily consumable.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8669";
		p.type = "Short Paper";
		p.authors = "Muhammad Saleem, Shanmukha Sampath Padmanabhuni, Axel-Cyrille Ngonga Ngomo, Jonas S. Almeida, Stefan Decker, Helena F. Deus";
		p.title = "Linked Cancer Genome Atlas Database (12.00 – 12.20)";
		p.paperAbstract = "<p style='text-align: justify;'>The Cancer Genome Atlas (TCGA) is a multidisciplinary, multi-institutional pilot project to create an atlas of genetic mutations responsible for cancer. One of the aims of this project is to develop an infrastructure for making the cancer related data publicly accessible, to enable cancer researchers anywhere around the world to make and validate important discoveries. However, data in the cancer genome atlas1 are organized as text archives in a set of directories. Devising bioinformatics applications to analyse such data is still challenging, as it requires downloading very large archives and parsing the relevant text files in order to collect the critical co-variates necessary for analysis. Furthermore, the various types of experimental results are not connected biologically, i.e. in order to truly exploit the data in the genome-wide context in which the TCGA project was devised, the data needs to be converted into a structured representation and made publicly available for remote querying and virtual integration. In this work, we address these issues by RDFizing data from TCGA and linking its elements to the Linked Open Data (LOD) Cloud. The outcome is the largest LOD data source (to the best of our knowledge) comprising of over 30 billion triples. This data source can be exploited through publicly available SPARQL endpoints, thus providing an easy-to-use, time-efficient, and scalable solution to accessing the Cancer Genome Atlas. We also describe show-cases which are enabled by the new linked data representation of the Cancer Genome Atlas presented in this paper.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8670";
		p.type = "Full Paper";
		p.authors = "Andreas Radinger, Alex Stolz, Martin Hepp";
		p.title = "BauDataWeb: The Austrian  Building and Construction  Materials Market as Linked  Data  ";
		p.paperAbstract = "<p style='text-align: justify;'>In this paper, we describe the technical approach of and experiences gained in exposing a major share of the European building and construction materials market on the basis of the GoodRelations Web vocabulary for e-commerce. This allows for the fine-grained search for products, suppliers, and warehouses for any building-related sourcing needs. Because building materials show a very high item specificity, they are very interesting for new types of search. Also, transportation costs for building materials are very significant, which makes the distance from the warehouse to the point of consumption a critical dimension of search. Based on existing data sources, we were able to include a rich, machine-readable description of individual product features using the FreeClassOWL ontology, which allow for multi-dimensional search. The result is one of the largest and richest public datasets for a well-defined trade sector that is available on the Semantic Web.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8671";
		p.type = "Full paper";
		p.authors = "Nicolas Marie, Myriam Ribiere, Fabien Gandon, Florentin Rodio";
		p.title = "Discovery Hub: on-the-fly linked data exploratory search";
		p.paperAbstract = "<p style='text-align: justify;'>Exploratory search systems help users learn or investigate a topic. The richness of the linked open data can be used to assist this task. We present a method that selects and ranks linked data resources that are semantically related to the user’s interest. The objective is to focus the user’s attention on a meaningful subset of highly informative resources. We extended spreading activation to typed graphs and coupled it with a graph sampling technique. The results selection and ranking is performed on–the-fly and doesn’t require pre-processing. This allows addressing remote SPARQL endpoints. We describe first implementation on top of DBpedia. It is used by the Discovery Hub exploratory search system to select interesting resources, to support faceted browsing of the results, to provide explanations and to offer redirections to third-party services. Results of a user evaluation conclude the article.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8672";
		p.type = "Full Paper";
		p.authors = "Oylum Alatli, Tayfun Gokmen Halac and Oguz Dikenelli";
		p.title = "Monitoring the Dynamism of the Linked Data Space through Environment Abstraction";
		p.paperAbstract = "<p style='text-align: justify;'>Management of data dynamics is a major issue for linked data applications. There are some approaches and applications addressing this problem which are either pull or push based. However, these one sided solutions do not solve the problem since pull based approaches bring an overhead to data consumers, and push based approaches require the collaboration of the data publishers which is contrary to the free nature of the Web of Data. In this paper, to monitor the dynamism of the linked data space, we present an infrastructure that combines pull and push approaches to monitor the changes of SPARQL queries over the linked data space. In the design of this infrastructure, environment abstraction of multi-agent systems domain is followed. The proposed infrastructure has been built upon the CArtAgO environment infrastructure, and VoID based federated query engine, WoDQA, is incorporated into CArtAgO to handle dynamic discovery of datasets and execution of monitored SPARQL queries.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8673";
		p.type = "Presentation";
		p.authors = "Stefanie Lindstaedt";
		p.title = "Opening";
		p.paperAbstract = "<p style='text-align: justify;'>Stefanie Lindstaedt (Know-Center, TU Graz), Michael Granitzer (University of Passau), Tassilo Pellegrini (St. Pölten University of Applied Sciences), Harald Sack (Hasso-Plattner-Institut, University of Potsdam)</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8674";
		p.type = "Presentation";
		p.authors = "Ellen Leenarts, Angela Fessl";
		p.title = "MIRROR: Reflective Learning at Work";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8675";
		p.type = "Presentation";
		p.authors = "Lydia Lau, Christina M. Steiner, Gudrun Wesiak, Vania Dimitrova, Dietrich Albert";
		p.title = "ImREAL: Immersive Reflective Experience-Based Adaptive Learning ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8676";
		p.type = "Presentation";
		p.authors = "Eva Hillemann, Christina M. Steiner, Alexander Nussbaumer, Dietrich Albert";
		p.title = "CULTURA: Cultivating Understanding and Research Through Adaptivity";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8677";
		p.type = "Presentation";
		p.authors = "Alexander Nussbaumer, Milos Kravcik, Dietrich Albert";
		p.title = "ROLE: Responsive Open  Learning Environments ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8680";
		p.type = "Presentation";
		p.authors = "Maria Fellner";
		p.title = "Ambient Assisted Living in the Context of Living, Learning and Mobility";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8681";
		p.type = "Presentation";
		p.authors = "Christian Fazekas, Franziska Matze";
		p.title = "Smart Health - A Psychosomatic Competence/Intelligence Perspective: Challenges in Health Promotion and in Clinical Fields";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8682";
		p.type = "Presentation";
		p.authors = "Jens Poggenburg";
		p.title = "Scheduling &amp; Tracking Management – Impact von Smart Services im automobile B2B Bereich";
		p.paperAbstract = "<p style='text-align: justify;'>Um sich als Unternehmen im B2B Bereich von seinen Mitbewerbern stärker zu differenzieren, reichen qualitativ hochwertige Produkte alleine nicht mehr aus. Geschäftspartner erwarten sich insbesondere für die Nutzungsphase, exzellente Zusammenarbeit und eine effiziente und fachgerechte Betreuung. Smart Service Konzepte helfen Kunden bei der Planung und Durchführung notwendiger Services mittels integrierter Workflows und nutzungsabhängiger Gerätedaten. Zu diesem Zweck werden Produkte befähigt, Informationen die im Zuge ihrer Verwendung generiert werden, an alle beteiligten Stakeholder im Wertschöpfungsprozess weiter zu reichen, um notwendige Aktivitäten zur Aufrechterhaltung des Betriebes der Produkte vorausschauend gestalten zu können. AVL zeigt im Rahmen ihrer Keynote, welchen Impact ein ganzheitlicher Smart Service Ansatz mit sich bringt und verdeutlicht dies an Hand eines dazu vorbereiteten Use Case Szenarios zur Planung und Nachverfolgung von Service Aktivitäten für Messinstrumente.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8683";
		p.type = "Presentation";
		p.authors = "Alfred Katzenbach";
		p.title = "Wissensbasierte Konstruktion in der Automobilentwicklung – Entwicklung – Stand der Umsetzung – künftige Herausforderungen";
		p.paperAbstract = "<p style='text-align: justify;'>Die Möglichkeiten der CAD Systeme haben sich in den letzten Jahren stark in Richtung eines zusammenbauorientierten Ansatzes entwickelt. In der Kombination mit leistungsfähigen PDM Lösungen sind bauteilübergreifende Assoziativitäten und Parameter nutzbar. Gleichzeitig haben sich auch die Fahrzeugkonzepte immer mehr in Richtung von Fahrzeugfamilien und übergreifende Module entwickelt. Wenn diese Systemmöglichkeiten mit einer konsequenten Konstruktionsmethodik verknüpft werden, können signifikante Effekte in der Produktentwicklung und in den nachgelagerten Prozessschritten erzielt werden. Neben der Konstruktionsmethodik und der Systemfähigkeit muss aber auch der Entwicklungsingenieur mit seinen Fähigkeiten und Wünschen mit berücksichtigt werden. Die erfolgreiche Umsetzung des neuen Produktentwicklungsprozesses ist ohne eine intensive arbeitspsychologische Begleitung sowie der dabei gewonnen Erkenntnisse nur bedingt möglich. Der Beitrag zeigt diese Entwicklung über die letzten Jahre und den heute erreichten Stand in der Feature und Templatekonstruktion und gibt einen Ausblick auf die künftigen Herausforderungen auf dem Gebiet des Systems-Engineering.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8684";
		p.type = "Presentation";
		p.authors = "Bernd Fachbach";
		p.title = "Mehrwert für Entwickler/-innen in der virtuellen Fahrzeug- entwicklung durch effizienten Zugriff auf Informationen und deren Zusammenhänge";
		p.paperAbstract = "<p style='text-align: justify;'>Der Informationsbedarf in der heutigen und zukünftigen Fahrzeugentwicklung ist exponentiell gestiegen. Es ergeben sich hohe Anforderungen an interdisziplinäre Zusammenarbeit über Abteilungs- und Unternehmensgrenzen hinweg. Um die Anwender in ihrem jeweiligen Fachbereich bestmöglich zu unterstützen, ist dabei gerade im Bereich der Funktionsentwicklung eine Vielzahl dezentraler Datencontainer entstanden.  Der Vortrag beschreibt sie aktuelle Situation der Informationsbeschaffung in der Fahrzeugentwicklung aus Anwendersicht und leitet daraus ein Konzept für den Zugriff und die flexible Vernetzung von Informationen und Daten aus heterogenen unstrukturierten und strukturierten Datenquellen in der virtuellen Fahrzeugentwicklung ab.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8688";
		p.type = "Workshop";
		p.authors = "Sebastian Dennerlein, Rene Kaiser, Patrick Hoefler";
		p.title = "Meet with fellow PhD students to get feedback on your dissertation project, and talk about all things related to a PhD. There is no fixed agenda and we invite you to participate in shaping the topics for this session. Former, soon-to-be and interested non-PhD students are welcome to take part in the action as well.";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8690";
		p.type = "Full Paper";
		p.authors = "Isabella Seeber";
		p.title = "Facilitating Team Processes  with Recommender Systems:  A Behavioral Science  Perspective ";
		p.paperAbstract = "<p style='text-align: justify;'>This position paper argues that recommender systems should be considered as fully automated facilitators having positive impact on team processes and consequently on team effectiveness. The paper builds upon the general organizational need to improve teams’ processes to enhance and sustain team effectiveness. However, current research on facilitation is little synthesized across research disciplines and typically focuses on the end-product of collaboration rather than on the team process itself when assessing team effectiveness. This paper puts forward the idea that today’s recommender systems, or more specifically, their recommendations, already provide content facilitation and technical facilitation, respectively. Little is known about their theoretical grounding in behavioral sciences a well as the impact of recommendations on team processes. A research agenda is presented in the form of a discussion.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8691";
		p.type = "Full Paper";
		p.authors = "Wilko Kraß, Ulrich Försterling";
		p.title = "Comparison of the Results of an Authorship-Based Expert Recommender Against Data from a Directory of Experts";
		p.paperAbstract = "<p style='text-align: justify;'>Expert recommender systems have been introduced and implemented in various ways. But due to legal issues, the special nature of human-bound knowledge and lack of acceptance by the staff only few case studies and even less evaluations in real world scenarios can be found. This paper presents a real world implementation of a simple expert recommender algorithm based on document authorship as well as an implementation of a directory of experts within one single company. Both have been implemented and therefore it is possible to compare the results of the recommender against data from the expert directory. Thus we wanted to gather first quantitative insights on how many documents a person should be author of before she might feel knowledgeable on a certain topic and even subscribe to it in the  directory of experts. These insights will also be presented.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8692";
		p.type = "Full Paper";
		p.authors = "Abdulbaki Uzun, Lorenz Lehmann, Thilo Geismar, Axel Küpper";
		p.title = "Turning the  OpenMobileNetwork into a  Live Crowdsourcing Platform  for Semantic Context-Aware  Services ";
		p.paperAbstract = "<p style='text-align: justify;'>The OpenMobileNetwork is a semantic model for mobile network topologies created by following the principles of Linked Data. By correlating data in the Linking Open Data Cloud with the OpenMobileNetwork, innovative Semantic Context-aware Services (CAS) can be realized that are not solely driven by classic context data (e.g., geographic location), but also include further information from the semantics of the context in use. So far, this open-source initiative provided rather static network topology data triplified from open-source cell databases, such as OpenCellID or OpenBMap. Integrating dynamic and live network context data (e.g., current traffic and number of users in a mobile network cell) by exploiting crowdsourcing methods will further improve the Semantic CAS experience since the historic and live state of a mobile network cell is a valuable data source to be taken into consideration when providing personalized services. The challenge in realizing such a crowdsourcing approach lies in motivating a significant number of users to contribute with their data. For this purpose, we have turned the OpenMobileNetwork from a static dataset into a Live Crowdsourcing Platform for Semantic CAS including a semantic cellular database based on extended network context ontologies, two smartphone clients, and a Measurement Framework for gamifying the crowdsourcing process of collecting network measurements. The measurement statistics highlight the effectiveness of this approach.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8693";
		p.type = "Full Paper";
		p.authors = "Stefano Bocconi, Stefano Travelli";
		p.title = "Rethinking Service Oriented Architectures in the Semantic Web";
		p.paperAbstract = "<p style='text-align: justify;'>By building a Service Oriented system on top of a semantic repository, the expectation is to get the best of both worlds, i.e. strong modelling capabilities exposed by reusable services, which can be exploited as building blocks for third-parties applications. In reality some “mismatches” make the combination not always optimal. Logic languages such as OWL and object-oriented languages such as Java have different paradigms. On the one hand, Software Oriented Architectures tend to favor stable interfaces for Web Clients, and to offer simplified versions of the objects used by the business logic on the server. On the other hand, Semantic Web clients make use of the rich semantics exposed by a semantic repository, which can be highly dynamic. This paper discusses these mismatches and suggests a different role for Software Oriented Architectures when integrated with Semantic Web technologies. The discussion is based on the experience in building a Web user interface using the services provided by a Service Oriented Architecture on top of a semantic repository.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8694";
		p.type = "Presentation";
		p.authors = "Angela Fessl";
		p.title = "Support of Reflective Learning in Health Care Sector: The MIRROR Approach";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8695";
		p.type = "Presentation";
		p.authors = "Peter Danner";
		p.title = "E.M.M.A. – Excellent Mobile Medical Application in Ambient Assisted Living (DALIA) ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8696";
		p.type = "Presentation";
		p.authors = "Michael Cik";
		p.title = "Potenzial von Mobilfunkbewegungsdaten im Verkehrswesen";
		p.paperAbstract = "<p style='text-align: justify;'>Großräumige Verkehrsuntersuchungen benötigen Fahrtenmatrizen mit Angabe von Quelle, Ziel und gewähltem Verkehrsmittel für jede Fahrt. Fahrtenmatrizen werden zeit- und kostenintensiv mit Hilfe von Verkehrsnachfragemodellen berechnet. Als Eingangsdaten für Verkehrsnachfragemodelle dienen raumbezogene Strukturdaten, Verkehrszählungen und unterschiedliche Formen der Verkehrsbefragung. Daher stellt sich die Frage, alternative Möglichkeiten zur Gewinnung von Quelle-Ziel-Matrizen zu finden. Eine neue Möglichkeit der Datengewinnung bietet sich durch die wiederholte Erkennung mobiler Endgeräte (z.B. Mobilfunktelefone, mobiles Internet, usw.). Aufgrund der hohen Verbreitung von Mobilfunktelefonen und der Möglichkeit, diese orten zu können, wird seit einiger Zeit versucht, diese Technologie zur Verkehrsdatengewinnung zu nutzen. Die Position von beweglichen Mobiltelefonen (floating phones) wird über die anonyme Ortung in einer Mobilfunkzelle durchgeführt. Die Nutzung der sogenannten pseudonymisierten IMSI (International Mobile Subscriber Identity) als individuelles Identifizierungsmerkmal jeder einzelnen SIM-Karte (Subscriber Identity Module) eines Mobilfunkgerätes in GSM- und UMTS-Mobilfunknetzen (Global System for Mobile Communications, Universal Mobile Telecommunications System) ermöglicht es, Ortswechsel von SIM-Karten zu detektieren und z.B. die Reisezeiten einzelner Mobilfunknutzer zu berechnen und somit Informationen über die Qualität der Verkehrslage zu bekommen. Dieser Beitrag beschäftigt sich mit der Verwendung von Mobilfunkdaten als Eingangsdaten für Verkehrsmodelle. Raumbezogenes Verkehrsaufkommen und Verkehrsverteilung werden durch die Auswertung von Mobilfunkdaten über einen längeren Zeitraum bestimmt. Neben einer Zeit- und Kostenersparnis soll durch die Einbeziehung und Kombination von Mobilfunkdaten mit derzeitig üblichen Erhebungsmethoden eine Qualitätsverbesserung erzielt werden. Eine offene Frage bei der Gewinnung von Nachfragematrizen aus Mobilfunkdaten ist die fehlende räumliche Kongruenz von Verkehrsbezirksgrenzen des Verkehrsmodells und der Zelleinteilung der Mobilfunkbetreiber. Weiterhin muss der Anteil der Mobilfunkbenutzer bezogen auf die Gesamtmenge der mobilen Bevölkerung berücksichtigt werden. In diesem Vortrag werden Lösungen zu diesen beiden Fragestellungen anhand eines kalibrierten multimodalen Verkehrsmodells in Verbindung mit einem eigens entwickelten Softwarewerkzeug zur Auswertung von Quelle-Ziel-Beziehungen aus Mobilfunkdaten vorgestellt.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8697";
		p.type = "Presentation";
		p.authors = "Mario Hirz";
		p.title = "MobilityCloud – Ein Konzept für den effizienten urbanen Individualverkehr der Zukunft";
		p.paperAbstract = "<p style='text-align: justify;'>Der eingereichte Vortrag beschäftigt sich mit visionären Szenarien der Bereitstellung von Individualmobilität in urbanen Bereichen. Ausgangsbasis ist die Überlegung, in kommunalen Anwendungen (z.B. bei Wohnungs­siedlungen, aber auch in Unternehmen mit Fuhrparkbedarf) eine Bandbreite von Fahrzeugen mit unterschiedlichen Eigenschaften zur Verfügung zu stellen und diese entsprechend den Anforderungen des Benutzers nutzbar zu machen. Eine besondere Herausforderung stellt dabei die Organisation der Flotte hinsichtlich der Auswahl und Bereitstellung der benötigten Fahrzeuge dar. Mit Hilfe der Verbindung moderner Anwendungen auf mobilen Endgeräten kann die individuelle Mobilität der Zukunft auf diese Weise als eine Dienstleistung angeboten werden, welche auf Grund des weitreichenden Optimierungspotenzials die Einsparung von Kosten, Ressourcen und Energie wesentlich unterstützt.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8702";
		p.type = "Full Paper";
		p.authors = "Muhammad Nasir, Orland Hoeber, Joerg Evermann";
		p.title = "Supporting Ontology Alignment Tasks with Edge Bundling";
		p.paperAbstract = "<p style='text-align: justify;'>Ontologies are commonly used for knowledge representation and to exchange information between multiple applications. When the same information is represented by different overlapping ontologies, information sharing requires a mapping between corresponding pairs of entities. While ontology alignment algorithms have been developed to support such tasks, they generally do not offer entirely complete and precise mappings. As a result, an important interactive aspect of the ontology alignment process is the validation of automatically generated mappings, as well as the addition of new mappings, by a knowledge manager. While visual ontology alignment interfaces exist to support these tasks, showing a large number of mappings can result in a significant amount of visual clutter. To address this issue, an edge bundling approach has been adapted to the constraints of an existing ontology alignment interface. A user study was designed and conducted to evaluate the value of edge bundling in this context, with positive results for both mapping validation and addition tasks.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8703";
		p.type = "Full Paper";
		p.authors = "Shunsuke Aoki, Ryosuke Saga, Takeo Ichinotsubo, Woyuan Niu, Hiroshi Tsuji";
		p.title = "Dependency Extraction from Growth Trajectory using Sequential Pattern";
		p.paperAbstract = "<p style='text-align: justify;'>To extract learning order dependencies, we propose a method for analyzing growth trajectories. Due to limitations of the ISM-based method, weaker dependencies considered negligible for most learners’ growth are likely to be lost. The proposed method, which is based on sequential pattern mining and minimum support, is expected to extract such dependencies. In addition, for complex dependencies, we can uniquely determine learning order by applying a pruning method based on supports. A case study of offshore software development is also discussed to verify the applicability of the proposed method.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8704";
		p.type = "Full Paper";
		p.authors = "Sebastian Schmidt, Simon Manschitz, Christoph Rensing, Ralf Steinmetz";
		p.title = "Extraction of Address Data from Unstructured Text using Free Knowledge Resources";
		p.paperAbstract = "<p style='text-align: justify;'>The Web is populated with many Web sites containing unstructured textual information. These Web sites are a source of knowledge for various interests. As semantic annotations are only rarely used on Web sites, an automated harvesting of the knowledge without additional effort is not possible. Thus, elaborated approaches for information extraction are required. In our work we face the challenge of identifying business address data on Web sites since we see the need for this data in various applications. In order to accomplish our aim, we have developed a hybrid approach combining patterns and gazetteers obtained from freely available knowledge resources such as OpenStreetMap. Experimental evaluation on a corpus of heterogeneous Web sites shows a high recall and precision. The approach can be adapted for identification of addresses considering the different formats in various countries.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8705";
		p.type = "Full Paper";
		p.authors = "Martin Eppler, Roland Pfister";
		p.title = "Best of Both Worlds: Hybrid  Knowledge Visualization in  Police Crime Fighting and  Military Operations ";
		p.paperAbstract = "<p style='text-align: justify;'>Making effective and timely use of all available, relevant knowledge is a major requirement for today’s police officers who strive to fight organized crime or resolve complex criminal acts under time pressure. As they share this knowledge integration challenge with many management contexts, we have examined the knowledge visualization practices of a leading regional police force (and of a military unit) in order to derive insights for corporate knowledge management. To do so, we have conducted on-site observations, focus groups, and interviews, as well as site-, document-, tool- and software- analyses within the police headquarters. As one main result of our empirical investigation, we find that the police force’s practice of hybrid (i.e., digital and physical) knowledge visualization offers a useful strategy for corporate knowledge management as well. We also show how organizations can apply this dual approach to making knowledge visible i.e., using sophisticated visualization software in combination with hands-on physical and permanently visible knowledge boards. We discuss how these two modalities can be combined to improve knowledge management and how this hybrid practice can be understood theoretically through the lens of boundary object theory. With this regard, we also extend boundary object theory by identifying nine dynamic qualities of collaborative visualizations.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8706";
		p.type = "Short Paper";
		p.authors = "Thomas Gruber, Sebastian Thiel, Wolfram Hardt";
		p.title = "Managing Knowledge Across Disciplines and Departments For Automotive X-In-The-Loop-Simulation ";
		p.paperAbstract = "<p style='text-align: justify;'>Virtual development has become a very important part of the car development process. Especially in the field of safe-guarding functions with their growing complexity Model-, Software- and Hardware-in-the-Loop-Simulations are indespensable instruments to ensure high quality cars. The paper presents the challanges of these simulation domains. The need for simulation model exchange across departments and disciplines is being described and the availability of documentation is identified as a key requirement. After evaluating commonly used methods of structured information representation, a new approach is being described, how to acquire and reuse a model documentation in a distributed way over the complete model development and function safe-guarding process.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8707";
		p.type = "Full Paper";
		p.authors = "Conny Christl, Jan Hladik, Markus Graube, Reinhard Willfort, Leon Urbas";
		p.title = "Using Mobile Technology For Inter-Organisational Collaboration and End-Customer Integration";
		p.paperAbstract = "<p style='text-align: justify;'>The pace of technological and social change profoundly impacts the manufacturing and service industry and determines an important driver for competitiveness. The EU Project ComVantage aims at addressing the limitations of the existing manufacturing ICT infrastructure by making use of the advantages of mobile and semantic technology. Along the use case of a micro company working in the textile industry we present our vision of how small companies can leverage their ability to compete in a global market by collaborating together as a virtual factory, and how they can offer innovative services by integrating their end-customers’ knowledge. We use lightweight and affordable mobile technology as infrastructure for connecting data from different business partners including the customers and present a new approach for building industrial mobile applications. Semantic technologies allow easy integration of different data sources and high flexibility, therefore we apply Linked Data principles for easily retrieving, exchanging and publishing information about products, user generated content or public information from the Linked Open Data web.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8708";
		p.type = "Full Paper";
		p.authors = "Kalpa Gunaratna, Prateek Jain, Amit Sheth, Sanjaya Wijeratne";
		p.title = "A Statistical and Schema Independent Approach to Identify Equivalent Properties on Linked Data";
		p.paperAbstract = "<p style='text-align: justify;'>Linked Open Data (LOD) cloud has gained significant attention in the Semantic Web community recently. Currently it consists of approximately 295 interlinked datasets with over 50 billion triples including 500 million links, and continues to expand in size. This vast source of structured information has the potential to have a significant impact on knowledge-based applications. However, a key impediment to the use of LOD cloud is limited support for data integration tasks over concepts, instances, and properties. Efforts to address this limitation over properties have focused on matching data-type properties across datasets; however, matching of object-type properties has not received similar attention. We present an approach that can automatically match object-type properties across linked datasets, primarily exploiting and bootstrapping from entity co-reference links such as owl:sameAs. Our evaluation, using sample instance sets taken from Freebase, DBpedia, LinkedMDB, and DBLP datasets covering multiple domains shows that our approach matches properties with high precision and recall (on average, F measure gain of 57% - 78%).</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8709";
		p.type = "Full Paper";
		p.authors = "Ivan Ermilov, Sören Auer, Claus Stadler";
		p.title = "User-Driven Semantic Mapping  of Tabular Data ";
		p.paperAbstract = "<p style='text-align: justify;'>Governments and public administrations started recently to publish large amounts of structured data on the Web, mostly in the form of tabular data such as CSV files or Excel sheets. Various tools and projects have been launched aiming at facilitating the lifting of tabular data to reach semantically structured and linked data. However, none of these tools supported a truly incremental, pay-as-you-go data publication and mapping strategy, which enables effort sharing between data owners, community experts and consumers. In this article, we present an approach for enabling the user-driven semantic mapping of large amounts tabular data. We devise a simple mapping language for tabular data, which is easy to understand even for casual users, but expressive enough to cover the vast majority of potential tabular mappings use cases. We outline a formal approach for mapping tabular data to RDF. Default mappings are automatically created and can be revised by the community using a semantic wiki. The mappings are executed using a sophisticated streaming RDB2RDF conversion. We report about the deployment of our approach at the Pan-European data portal PublicData.eu, where we transformed and enriched almost 10,000 datasets accounting for 7.3 billion triples.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8710";
		p.type = "Full Paper";
		p.authors = "Christian Mader, Bernhard Haslhofer";
		p.title = "Perception and Relevance  of Quality Issues in Web  Vocabularies ";
		p.paperAbstract = "<p style='text-align: justify;'>Web vocabularies provide organization and orientation in information environments and can facilitate resource discovery and retrieval. Several tools have been developed that support quality assessment for the increasing amount of vocabularies expressed in SKOS and published as Linked Data. However, these tools do not yet take into account the users’ perception of vocabulary quality. In this paper, we report the findings from an online survey conducted among experts in the field of vocabulary development to study the perception and relevance of vocabulary quality issues in the context of real-world application scenarios. Our results indicate that structural and labeling issues are the most relevant ones. We also derived design recommendations for vocabulary quality checking tools.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8711";
		p.type = "Presentation";
		p.authors = "Ulrike Hönsch, Michael Bolzer";
		p.title = "Brockhaus Online – Inhalt & Portaltechnik";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8712";
		p.type = "Presentation";
		p.authors = "Christopher Koska";
		p.title = "Brockhaus Online – Forschung und Entwicklung";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8713";
		p.type = "Presentation";
		p.authors = "Steffen Leich-Nienhaus";
		p.title = "API Ökosysteme in Informationsabteilungen großer Organisationen";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8714";
		p.type = "Presentation";
		p.authors = "Andreas Koller, Helmut Nagy";
		p.title = "How does Linked Data Change the Enterprize Collaboration? ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8715";
		p.type = "Presentation";
		p.authors = "Michael Aleythe";
		p.title = "Topic/S – A Topic and Trend Recognition Approach in News-Media ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8716";
		p.type = "Presentation";
		p.authors = "Sigmar Pallaschke";
		p.title = "Lessons Learned Methodology";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8719";
		p.type = "Full Paper";
		p.authors = "Peter Teufl, Herbert Leitold, Reinhard Posch";
		p.title = "Semantic Pattern Transformation";
		p.paperAbstract = "<p style='text-align: justify;'>Machine learning algorithms play in an important role in knowledge discovery due to their capability to analyze data for which only limited a priori knowledge is available. Unfortunately, their application and the extraction of information from the trained algorithm models highly depend on the nature of the analyzed data and the algorithm models. Therefore, the deployment of knowledge discovery processes in heterogeneous domains causes the requirement for time-consuming process adaptations. In this work, we argue that the value-centric feature vector representation used within machine learning is the main reason for the necessity to create such highly domain-specific setups. Therefore, the Semantic Pattern Transformation is presented, which transforms the value-centric feature vectors into a semantic representation – the Semantic Patterns. The principle idea behind this process is to analyze the relations (co-occurrences) of feature values within the value-centric feature vectors, and use this information within a new vector-based representation – the Semantic Patterns. The simple model used within this representation comes with many advantages, including the simplified setup procedure for arbitrary machine learning algorithms within heterogeneous domains and the simple interpretation of the underlying model. We have already successfully applied the Semantic Pattern Transformation in numerous applications including text analysis, event correlation, malware detection, analysis of Twitter data and Android application analysis. This work extends the application-oriented works by a detailed explanation of the method and a thorough evaluation of supervised and unsupervised learning scenarios, and the application within semantic-aware search algorithms.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8720";
		p.type = "Full Paper";
		p.authors = "Kris Krois, Klaus Gasteier, Frantisek Hrdina";
		p.title = "Exploratory Search and  Content Discovery:  The Semantic Media Browser (SMB) ";
		p.paperAbstract = "<p style='text-align: justify;'>In the age of broadband Internet and social media, users are faced with the need to adapt to an unprecedented flood of continuous information. The growing necessity of search and discovery solutions has inspired innovative technologies like better search algorithms, adaptive filtering or recommender systems. Innovations in knowledge and data engineering are still a challenge for new interaction concepts and effective user interfaces (UI). How do users with poor familiarity within a domain of interest search and discover relevant things they do not know yet? How can we integrate search, navigation and consumption in a fluent user experience that both reduces complexity and presents overview of interrelated content on multiple dimensions.<br/>In this paper, we present the Semantic Media Browser (SMB), an interaction concept and an interface system for exploratory search and media discovery, as a possible answer to these questions. We describe a system that is a universal visualizing and browsing solution in one. It aims to enable non-expert users to discover more with less effort in an intrinsically motivating manner. In this paper we highlight specifics of our visual mapping and interaction approach as well as the technical design of the system.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8721";
		p.type = "Full Paper";
		p.authors = "Jörgen Jaanus, Tobias Ley";
		p.title = "Aligning Knowledge Development between Innovation-Driven Context and Knowledge Organization Systems";
		p.paperAbstract = "<p style='text-align: justify;'>While semantic technologies are successfully used in some more static and business critical domains like public management or financial services the adoption in innovation driven contexts has been more hesitant. The challenge of aligning knowledge development between innovation-driven context and knowledge organization systems by introducing social semantic technologies requires the shift from creation centered to addition centered approach in dealing with new concepts. For any organizational context there is something existent with applied classification logic which has to be considered while creating new knowledge. In order to study an impact of stabilizing and dynamic forces on knowledge organization systems we investigate concept compounding as ontological change. As new concepts emerge through knowledge maturing process and have direct impact on enterprise knowledge organization systems, a longitudinal approach is needed that follows development of new concepts over time. We took this approach by analyzing ontology maturing in an international company which provides professional services to both institutional and private customers. We present examples of the compounding of six new concepts as interactions between dynamic forces which are functioning within social technologies and stabilizing forces in the form of arbitrary knowledge organization systems. Based on our conclusions we propose Knowledge Alignment Model and list the services which will be developed further for applying Social Semantic Technologies in an organizational context. The model is a connection between the conceptual considerations presented as a shift from creation to addition and between design activities to make this shift happen.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8722";
		p.type = "Full Paper";
		p.authors = "Manfred Bornemann, Kay Alwert";
		p.title = "Professional Management of Intellectual Capital in the Automotive Industry of Baden-Württemberg";
		p.paperAbstract = "<p style='text-align: justify;'>This case study shows how the management of Intellectual Capital D.2.9 [Management Productivity] has been professionalized to the sustainable benefit of stakeholders. As a prototype application, the cluster initiative automotive-bw is of particular interest, because it represents a country wide association of nine regional clusters in Baden Württemberg, one of the world's leading automotive regions. automotive-bw is dedicated to achieve the ambitious goal of innovating energy efficient vehicles through the advanced networking of leading players across the country and thus contributes to global environmental protection as well as to securing the competitiveness of the local automotive industry (AUT10). Since 2010, Intellectual Capital is in the focus of analysis in the automotive-bw and now (2013) allows an evaluation of the developments over a period of 3 years. The results are incorporated into the controlling and risk management of the three cluster levels and are used to intervene proactively and to monitor the impact of management actions. As a result of PRIMA cluster (Professional Intellectual Capital MAnagement in clustered organizations), the transparency about the status quo of Intellectual Capital within the participating clusters could be increased. As a direct consequence, the cluster management could be improved. The participating cluster managers welcomed in particular the opportunity of gaining deep insights into the implicit patterns of the clusters involved. Additionally, the individual challenges of each cluster were discussed in a structured exchange of experience, based on qualitative benchmarking and thus served as a learning tool. The consolidation of the results of the regional clusters to a country level allowed the coordination of the inherently individual interests of each regional cluster and to set consensual priorities to strengthen synergies and to improve the competitiveness of automotive-bw. This alignment process and the resulting consensual allocation of efforts and funds to the prioritized fields of intervention warrants highest marginal benefits of the scarce public as well as private resources.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8723";
		p.type = "Presentation";
		p.authors = "Michael Heiss (Siemens)";
		p.title = "Siemens Internal Social Media Technologies - TechnoWeb ";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8725";
		p.type = "Presentation";
		p.authors = "Barbara Kump";
		p.title = "SMEs in Change";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8726";
		p.type = "Presentation";
		p.authors = "Karin Grasenick";
		p.title = "Supporting the Innovation Process with Knowledge Management Tools";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8730";
		p.type = "Keynote";
		p.authors = "Tiit Paananen";
		p.title = "Skype: Continuous Learning of Skype Engineers";
		p.paperAbstract = "<p style='text-align: justify;'>Skype is now part of Microsoft where learning and development is happening every day. Skype is probably organization and also technology that has seen a lot of changes over the years but has managed to keep it together and show persistent growth both in numbers and organization size. We are global engineering organization and master distributed development in agile way. By now we have reached situation where we recognize that no matter how you organize or what methodology you choose, you just change one set of problems to another. In my presentation I will walk with you through biggest changes and do few deep dives on some of most challenging issues.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8733";
		p.type = "Keynote";
		p.authors = "Ed H. Chi";
		p.title = "The Science of Social Interactions on the Web";
		p.paperAbstract = "<p style='text-align: justify;'>Social interactions have always been an important part of human learning and experience. We now know that social interactions are critical in many knowledge and information processes. Research has shown results ranging from influences on our behavior from social networks [Aral2012] to our understanding of social belonging on health [Walton2011], as well as how conflicts and coordination play out in Wikipedia [Kittur2007]. Interestingly, social scientists have studied social interactions for many years, but it wasn’t until very recently that researchers can study these mechanisms through the explosion of services and data available on web-based social systems. In this talk, I plan to illustrate a model-driven approach to researching social interactions on the Web. Our research methods and systems are informed by models such as information scent, sensemaking, information theory, probabilistic models, and evolutionary dynamic models. These models have been used to understand a wide variety of user behaviors, from individuals interacting with social bookmarks in Delicious to groups of people working on articles in Wikipedia. These models range in complexity from a simple set of assumptions to complex equations describing human and group behaviors. By using this model-driven approach, we further our understanding of how knowledge is fundamentally constructed in a social context, and a path forward for further social interaction research.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8734";
		p.type = "Keynote";
		p.authors = "Aldo Gangemi";
		p.title = "Objective Fiction: The Semantic Construction of (Web) Reality";
		p.paperAbstract = "<p style='text-align: justify;'>The semantic web has somehow reached its maturity, with its merits and defects. A deep revision of its assumptions is ongoing in the community due to the lessons learnt, and the contact with other ways to implement semantics in legacy as well as neighboring (academic or industrial) research programmes. I will discuss how semantics contributes to the shaping of web knowledge, and beyond that, of social reality. That will be related to cognitive aspects as well as technological results. In particular, I will present methods and tools for the extraction, representation, and harnessing of semantic patterns.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8735";
		p.type = "Keynote";
		p.authors = "Yves Raimond";
		p.title = "Current and Future Uses of Semantic Web Technologies at the BBC";
		p.paperAbstract = "<p style='text-align: justify;'>The BBC generates a vast quantity of information, broadcasting between 1,000 and 1,500 programmes per day and generating a significant news output. The BBC has also accumulated a very large archive of TV and radio programmes, as well as pictures, texts, musical scores etc. since 1922. Managing all this information constitutes a major challenge. In this talk we are going to give an overview of how Semantic Web technologies are being used on the BBC web site to facilitate consuming, managing and publishing this information. We will first describe various Semantic Web-related efforts undertaken by the BBC since 2004 and how those efforts are now converging in a BBC Linked Data Platform. We will then describe work undertaken by BBC R&D to investigate how a mixture of Semantic Web technologies, machine-generated annotations and crowdsourcing can enable us to publish large archives of content very quickly.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8736";
		p.type = "Demo";
		p.authors = "Chandan Kumar, Wilko Heuten Susanne Boll";
		p.title = "A Visual Interactive System for Spatial Querying and Ranking of Geographic Regions";
		p.paperAbstract = "<p style='text-align: justify;'>Local search services provide information access about specific locations, facilities and geographic points of interest. However, in various information seeking situations users are not only interested in the specific geo entities but the composition of urban areas and geographic regions. Users need to specify, analyze and compare the geographic regions, which is not feasible with the current local search systems as their querying, ranking and presentation methods are centered towards definite locations and entities. In this paper we propose a visual interactive system that goes beyond the explicit locations, and support the search and exploration of geographic regions. The proposed system allows user to illustrate their geographic regions of interest via spatial querying on map interface, and subsequently search for the related relevant regions. The relevance assessment of geographic regions is based on the categorical distribution of geo-located facilities. Users could interact with the categorical overview of the regions, to analyze the composition of selected regions, as well as to adapt it to their criteria of interests.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8737";
		p.type = "Demo";
		p.authors = "Oliver Bieh-Zimmert, Claudia Koschtial, Carsten Felden";
		p.title = "Representing Multidimensional Cancer Registry Data";
		p.paperAbstract = "<p style='text-align: justify;'>Epidemiology requires the analysis and visualization of massive data sets. The field of cancer statistics in particular is facing the challenging task of visualizing a large data set that contains a wide range of available dimensions. The existing work of epidemiologists has been time-consuming because of visualization techniques that could not be scaled to support an unguided exploration process. This limitation has led to the inefficient use of data representations that are mainly used for detailed analysis. Our goal was to find a scalable visualization technique that focused on covering a wide range of categorical information. For this purpose, a task by data type taxonomy is used to analyze the existing data visualization techniques. The chosen representation was based on the implemented flow visualization and provided an overview for exploring the data by epidemiologists. In this way, a more scalable visualization delivered the ability to support the creation of hypotheses by finding relationships of interest.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8738";
		p.type = "Demo";
		p.authors = "Chandan Kumar, Wilko Heuten Susanne Boll";
		p.title = "A Visual Interactive System for Spatial Querying and Ranking of Geographic Regions";
		p.paperAbstract = "<p style='text-align: justify;'>Local search services provide information access about specific locations, facilities and geographic points of interest. However, in various information seeking situations users are not only interested in the specific geo entities but the composition of urban areas and geographic regions. Users need to specify, analyze and compare the geographic regions, which is not feasible with the current local search systems as their querying, ranking and presentation methods are centered towards definite locations and entities. In this paper we propose a visual interactive system that goes beyond the explicit locations, and support the search and exploration of geographic regions. The proposed system allows user to illustrate their geographic regions of interest via spatial querying on map interface, and subsequently search for the related relevant regions. The relevance assessment of geographic regions is based on the categorical distribution of geo-located facilities. Users could interact with the categorical overview of the regions, to analyze the composition of selected regions, as well as to adapt it to their criteria of interests.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8739";
		p.type = "Demo";
		p.authors = "Oliver Bieh-Zimmert, Claudia Koschtial, Carsten Felden";
		p.title = "Representing Multidimensional Cancer Registry Data";
		p.paperAbstract = "<p style='text-align: justify;'>Epidemiology requires the analysis and visualization of massive data sets. The field of cancer statistics in particular is facing the challenging task of visualizing a large data set that contains a wide range of available dimensions. The existing work of epidemiologists has been time-consuming because of visualization techniques that could not be scaled to support an unguided exploration process. This limitation has led to the inefficient use of data representations that are mainly used for detailed analysis. Our goal was to find a scalable visualization technique that focused on covering a wide range of categorical information. For this purpose, a task by data type taxonomy is used to analyze the existing data visualization techniques. The chosen representation was based on the implemented flow visualization and provided an overview for exploring the data by epidemiologists. In this way, a more scalable visualization delivered the ability to support the creation of hypotheses by finding relationships of interest.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8740";
		p.type = "Discussion";
		p.authors = "Christoph Trattner";
		p.title = "Closing Discussion";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8741";
		p.type = "Presentation";
		p.authors = "Michael Wiesmüller, Stefanie Lindstaedt";
		p.title = "Opening";
		p.paperAbstract = "<p style='text-align: justify;'>Stefanie Lindstaedt (Know-Center, TU Graz), Michael Granitzer (University of Passau), Tassilo Pellegrini (St. Pölten University of Applied Sciences), Harald Sack (Hasso-Plattner-Institut, University of Potsdam)</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8743";
		p.type = "Presentation";
		p.authors = "Christian Derler, Robert Hinterberger";
		p.title = "IKT-Innovationen für intelligente Energienetze und -systeme – internationale Best Practises und Potentiale in Österreich";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8744";
		p.type = "Presentation";
		p.authors = "Peter A. Bruck";
		p.title = "Microlearning in Practice: Managing from Human Resour- ces to Knowledge Resources";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8745";
		p.type = "Workshop";
		p.authors = "Manfred Aigner, Robert Lecker";
		p.title = "Smart-Region - Interactive Dissemination Workshop";
		p.paperAbstract = "<p style='text-align: justify;'>Graphic Recording, Dissemination Strategy, Press Relations and Social Media for Researchers Including Elevator Pitch Contest</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8746";
		p.type = "Poster";
		p.authors = "Benjamin Mühleisen, Claudio Schneider, Hans Friedrich Witschel, Christian Gutknecht";
		p.title = "Success Factors of Enterprise 2.0";
		p.paperAbstract = "<p style='text-align: justify;'>This paper presents the results of three interlinked case studies in companies who have recently introduced Wiki software. The case studies were all conducted with the same methodology, starting with an interview with the responsible person, design of a survey based on the interview findings and then application and interpretation of the survey. The goal of the studies was to identify success factors and/or barriers for Enterprise 2.0 adoption. The results show some clear common trends among the studied companies, which lead to a set of general recommendations for successful introduction of Enterprise 2.0.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8747";
		p.type = "Poster";
		p.authors = "Selver Softic, Manfred Rosenberger, Alexander Stocker, Andrea Denger, Johannes Fritz";
		p.title = "Semantically Based Visual Tracking of Engineering Tasks in Automotive Product Lifecycle";
		p.paperAbstract = "<p style='text-align: justify;'>Stakeholders in specific disciplines, departments, companies and at different locations within the automotive production process save their results in different data management systems. Project management is currently done separately and does not interact with engineering objects. Our work aims on providing flexible data insights on collaboration tasks between participants within the product lifecycle. We applied semantic technologies RDF1 , OWL2 and SPARQL3 with a specific domain related ontology PROTARES4 (PROject TAsks RESources) to interlink, describe and query domain knowledge about the product. As proof of concept a software prototype is introduced, which resides on the domain ontology and allows knowledge based browsing and visualisation of specific aspects within the production process. With this example we want to demonstrate, how semantically driven customized views can support monitoring and reflection of engineering tasks and decision making within the early phases of the automotive product lifecycle.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8748";
		p.type = "Poster";
		p.authors = "David Chudán, Vojtech Svátek";
		p.title = "Advanced Mining of Association Rules over Periodic Snapshots in a Data Warehouse";
		p.paperAbstract = "<p style='text-align: justify;'>The traditional approach to integration of data mining algorithms with OLAP is that of predictive mining applied on transactional data with the aim of explaining the findings manually discovered via OLAP. We propose an alternative model, in which a descriptive mining system operates on data already aggregated for OLAP, namely, on periodic snapshots of observed measures. The proposed solution aims to provide the business analyst with hypotheses about relative frequencies of snapshots satisfying various dimensional values, as guidance for OLAP-based analysis. The rich inventory of hypothesis features in the GUHA data mining method and the efficient processing by the underlying LISp-Miner tool is being exploited for this purpose.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8749";
		p.type = "Poster";
		p.authors = "Wolfgang Radl, Jonatan Skopek, Anton Komendera, Stefan Jäger, Felix Mödritscher";
		p.title = "And Data for All: On the Validity and Usefulness of Open Government Data";
		p.paperAbstract = "<p style='text-align: justify;'>Open Government Data (OGD) stands for a relatively young trend to make data that is collected and maintained by state authorities available for the public. Although various Austrian OGD initiatives have been started in the last few years, less is known about the validity and the usefulness of the data offered. Based on the data-set on Vienna’s stock of trees, we address two questions in this paper. First of all, we examine the quality of the data by validating it according to knowledge from a related discipline. It shows that the data-set we used correlates with findings from meteorology. Then, we explore the usefulness and exploitability of OGD by describing a concrete scenario in which this data-set can be supportive for citizens in their everyday life and by discussing further application areas in which OGD can be beneficial for different stakeholders and even commercially used.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8750";
		p.type = "Poster";
		p.authors = "Tanja Buttler, Stephan Lukosch";
		p.title = "On the Implications of Lessons Learned Use for Lessons Learned Content";
		p.paperAbstract = "<p style='text-align: justify;'>Project-based organizations (PBOs) collect and use lessons learned (LL) in order to prevent reinventing the wheel or repeating mistakes. LL can be defined as documented knowledge gained from experience, successful or otherwise, for the purpose of improving future performance [4]. Their content influences how they can or cannot be applied, but so far research on the requirements on LL has focused on usage after retrieval from information systems, and ignored potential alternatives. Therefore, this article investigates how LL are used in organizations and what implications the use of LL has for their content. For this purpose, a literature review and a series of interviews explore existing processes for using LL. The results suggest that the usage of LL varies: they are applied in the next project, or used directly within the organization. In both cases, LL can be used in the intelligence or design phase of an (organizational) decision making process. These phases influence the required content of a LL. For the intelligence phase, LL should provide a detailed understanding of a problem; for the design phase, they should include an approach addressing the problem.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8751";
		p.type = "Poster";
		p.authors = "Hanan Alotaibi, Gary Wills, Richard Crowder";
		p.title = "Investigating Factors for Knowledge Sharing Using Web Technologies";
		p.paperAbstract = "<p style='text-align: justify;'>Global knowledge has become a central issue for an organization's survival. In the last few decades, Web technologies have become widely used for Knowledge Management; these are called Knowledge Management Systems (KMS). Recently, in Knowledge Management (KM) the effectiveness of knowledge sharing has been considered a significant component for KMS success. In the most universities the KM is often inadequate when it comes to knowledge sharing, especially between academics. In order to encourage knowledge sharing, it is important to know why/where/when academics choose to contribute or to receive shared knowledge. Therefore, the purpose of this research is to investigate the factors that affect an academics' behavior towards knowledge sharing by using technology. Knowledge Sharing Technology model (KST) is proposed model was constructed combining the affecting factors: these factors are a synthesis of factors which already exist in current theories, i.e. the Unified Theory of Acceptance and Use of Technology (UTAUT) and Social Exchange Model (SET), as well as other factors which are always explored independently in research studies The future work will focus on confirming the model.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8752";
		p.type = "Poster";
		p.authors = "Armand Brahaj";
		p.title = "Capturing and Sharing Scientific Research Data";
		p.paperAbstract = "<p style='text-align: justify;'>While researchers are primarily concerned with the output of their investigations, there is an increased focus on the datasets produced in investigations and their reusability. This work is focused on describing a technical scenario of scientific data management starting with the live data capture taking place in the investigation environment, followed by modeling and annotating of the raw data, data curation tools and finally publication of the datasets in a repository adhering to Linked Data principles. The solution is based on the eSciDoc platform but the process, the data formalization and other findings can be reused in any Virtual Research Environment (VRE) to achieve the same outcome. Special effort of the work is dedicated to the flexibility and quality of the data focusing on the preparation of the data for publication and provision of contextual information.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8753";
		p.type = "Poster";
		p.authors = "Benjamin Mühleisen, Claudio Schneider, Hans Friedrich Witschel, Christian Gutknecht";
		p.title = "Success Factors of Enterprise 2.0";
		p.paperAbstract = "<p style='text-align: justify;'>This paper presents the results of three interlinked case studies in companies who have recently introduced Wiki software. The case studies were all conducted with the same methodology, starting with an interview with the responsible person, design of a survey based on the interview findings and then application and interpretation of the survey. The goal of the studies was to identify success factors and/or barriers for Enterprise 2.0 adoption. The results show some clear common trends among the studied companies, which lead to a set of general recommendations for successful introduction of Enterprise 2.0.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8754";
		p.type = "Poster";
		p.authors = "Selver Softic, Manfred Rosenberger, Alexander Stocker, Andrea Denger, Johannes Fritz";
		p.title = "Semantically Based Visual Tracking of Engineering Tasks in Automotive Product Lifecycle";
		p.paperAbstract = "<p style='text-align: justify;'>Stakeholders in specific disciplines, departments, companies and at different locations within the automotive production process save their results in different data management systems. Project management is currently done separately and does not interact with engineering objects. Our work aims on providing flexible data insights on collaboration tasks between participants within the product lifecycle. We applied semantic technologies RDF1 , OWL2 and SPARQL3 with a specific domain related ontology PROTARES4 (PROject TAsks RESources) to interlink, describe and query domain knowledge about the product. As proof of concept a software prototype is introduced, which resides on the domain ontology and allows knowledge based browsing and visualisation of specific aspects within the production process. With this example we want to demonstrate, how semantically driven customized views can support monitoring and reflection of engineering tasks and decision making within the early phases of the automotive product lifecycle.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8755";
		p.type = "Poster";
		p.authors = "David Chudán, Vojtech Svátek";
		p.title = "Advanced Mining of Association Rules over Periodic Snapshots in a Data Warehouse";
		p.paperAbstract = "<p style='text-align: justify;'>The traditional approach to integration of data mining algorithms with OLAP is that of predictive mining applied on transactional data with the aim of explaining the findings manually discovered via OLAP. We propose an alternative model, in which a descriptive mining system operates on data already aggregated for OLAP, namely, on periodic snapshots of observed measures. The proposed solution aims to provide the business analyst with hypotheses about relative frequencies of snapshots satisfying various dimensional values, as guidance for OLAP-based analysis. The rich inventory of hypothesis features in the GUHA data mining method and the efficient processing by the underlying LISp-Miner tool is being exploited for this purpose.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8756";
		p.type = "Poster";
		p.authors = "Wolfgang Radl, Jonatan Skopek, Anton Komendera, Stefan Jäger, Felix Mödritscher";
		p.title = "And Data for All: On the Validity and Usefulness of Open Government Data";
		p.paperAbstract = "<p style='text-align: justify;'>Open Government Data (OGD) stands for a relatively young trend to make data that is collected and maintained by state authorities available for the public. Although various Austrian OGD initiatives have been started in the last few years, less is known about the validity and the usefulness of the data offered. Based on the data-set on Vienna’s stock of trees, we address two questions in this paper. First of all, we examine the quality of the data by validating it according to knowledge from a related discipline. It shows that the data-set we used correlates with findings from meteorology. Then, we explore the usefulness and exploitability of OGD by describing a concrete scenario in which this data-set can be supportive for citizens in their everyday life and by discussing further application areas in which OGD can be beneficial for different stakeholders and even commercially used.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8757";
		p.type = "Poster";
		p.authors = "Tanja Buttler, Stephan Lukosch";
		p.title = "On the Implications of Lessons Learned Use for Lessons Learned Content";
		p.paperAbstract = "<p style='text-align: justify;'>Project-based organizations (PBOs) collect and use lessons learned (LL) in order to prevent reinventing the wheel or repeating mistakes. LL can be defined as documented knowledge gained from experience, successful or otherwise, for the purpose of improving future performance [4]. Their content influences how they can or cannot be applied, but so far research on the requirements on LL has focused on usage after retrieval from information systems, and ignored potential alternatives. Therefore, this article investigates how LL are used in organizations and what implications the use of LL has for their content. For this purpose, a literature review and a series of interviews explore existing processes for using LL. The results suggest that the usage of LL varies: they are applied in the next project, or used directly within the organization. In both cases, LL can be used in the intelligence or design phase of an (organizational) decision making process. These phases influence the required content of a LL. For the intelligence phase, LL should provide a detailed understanding of a problem; for the design phase, they should include an approach addressing the problem.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8758";
		p.type = "Poster";
		p.authors = "Hanan Alotaibi, Gary Wills, Richard Crowder";
		p.title = "Investigating Factors for Knowledge Sharing Using Web Technologies";
		p.paperAbstract = "<p style='text-align: justify;'>Global knowledge has become a central issue for an organization's survival. In the last few decades, Web technologies have become widely used for Knowledge Management; these are called Knowledge Management Systems (KMS). Recently, in Knowledge Management (KM) the effectiveness of knowledge sharing has been considered a significant component for KMS success. In the most universities the KM is often inadequate when it comes to knowledge sharing, especially between academics. In order to encourage knowledge sharing, it is important to know why/where/when academics choose to contribute or to receive shared knowledge. Therefore, the purpose of this research is to investigate the factors that affect an academics' behavior towards knowledge sharing by using technology. Knowledge Sharing Technology model (KST) is proposed model was constructed combining the affecting factors: these factors are a synthesis of factors which already exist in current theories, i.e. the Unified Theory of Acceptance and Use of Technology (UTAUT) and Social Exchange Model (SET), as well as other factors which are always explored independently in research studies The future work will focus on confirming the model.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8759";
		p.type = "Poster";
		p.authors = "Armand Brahaj";
		p.title = "Capturing and Sharing Scientific Research Data";
		p.paperAbstract = "<p style='text-align: justify;'>While researchers are primarily concerned with the output of their investigations, there is an increased focus on the datasets produced in investigations and their reusability. This work is focused on describing a technical scenario of scientific data management starting with the live data capture taking place in the investigation environment, followed by modeling and annotating of the raw data, data curation tools and finally publication of the datasets in a repository adhering to Linked Data principles. The solution is based on the eSciDoc platform but the process, the data formalization and other findings can be reused in any Virtual Research Environment (VRE) to achieve the same outcome. Special effort of the work is dedicated to the flexibility and quality of the data focusing on the preparation of the data for publication and provision of contextual information.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8760";
		p.type = "Poster / Demo";
		p.authors = "Alexander Nussbaumer, Christina M. Steiner, Eva-Catherine Hillemann, Dietrich Albert";
		p.title = "Equalia - A Multi-Modal and Multi-Purpose Evaluation Service";
		p.paperAbstract = "<p style='text-align: justify;'>Evaluation is key when aiming at creating effective software solutions and platforms that target end-users as important stakeholders. The Web-based service Equalia is intended to support evaluators in designing, carrying out, and analysing evaluations. Originally developed in a digital libraries context (CULTURA project) for the evaluation of a research environment for cultural heritage collections, Equalia is grounded on a general conceptual approach that provides the opportunity to be applied also in other contexts. It allows specifying an evaluation model consisting of qualities (aspects to be measured) and instruments how to assess these qualities. Based on an established evaluation model data collection is supported by explicitly asking end-users during (individual questions) and after the usage (questionnaires) of the evaluated system, but also by monitoring the behaviour of users during the system usage (interaction data). The evaluation data, once collected, can be automatically analysed based on the defined evaluation models. Reports including diagrams are automatically created that take into account all these type of collected data. These different types of data are triangulated against the defined qualities, in order to get information about the overall quality of the evaluated system. Equalia exposes a REST interface for sending evaluation data to Equalia and also for receiving reports in machine-readable format. The latter allows the evaluated system to continuously get information about its qualities.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8761";
		p.type = "Poster / Demo";
		p.authors = "Alexander Nussbaumer, Milos Kravcik, Ralf Klamma, Dietrich Albert";
		p.title = "ROLE Platform - A Technical Infrastructure to Support Self-Regulated Learning";
		p.paperAbstract = "<p style='text-align: justify;'>In the recent years a trend became very popular to create small applications for speci?c purposes with limited functionalities. This trend has also been taken up by learning environments technologies that allow for integrating such applications to a Personal Learning Environment (PLE). In the context of the EU-funded ROLE project (http://role-project.eu/), a platform has been created where users (learners and teachers) can create such PLEs. In contrast to other PLE technologies, ROLE offers a technical infrastructure that enables these applications (also called widgets) to communicate with each other and to store its data. Furthermore, such compilations (also called learning spaces) can be shared with others, e.g. a teacher can share the space with her students. The infrastructure also includes a learning ontology that allows for recommending applications for certain purposes. The ROLE Widget Store manages the applications and provides facilities to catalogue, tag, and search them. All this technology is based on a model of Self-Regulated Learning that guides learners through their learning process by effectively using the ROLE technology.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8762";
		p.type = "Poster / Demo";
		p.authors = "Marina Bratic, Granit Luzhnica";
		p.title = "What and How  Can I Learn More About My Time-Use?";
		p.paperAbstract = "<p style='text-align: justify;'>The KnowSelf application is intended to support reflective learning regarding personal time-management and self-organisation. The current version of the App logs user activities on the PC, namely applications and resources used together with the exact time of use. Thereby it provides an AS IS analysis of how users spend their time at work. The overview and various visualisations of the captured data are available in the App with the intention to lead to reflection on personal time management and potentially motivate improvements in this respect. The data are available only for personal use but can be shared anonymously for further analyses. This personal time management analysis tool is targeted towards knowledge workers who spend most of their working time on a PC. A majority of them face challenging situations at work, which are often accompanied by multitasking and time pressure. Therefore it is often very useful to reflect on the use of time and consider future changes. The ability to effectively organise their own time, which is a limited resource, is crucial in order to carry out the work effectively and to counteract frustration and stress at work.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8763";
		p.type = "Poster / Demo";
		p.authors = "Angela Fessl, Verónica Rivera-Pelayo, Alfred Wertner";
		p.title = "Colour your Mood to Support the Emotional Knowledge Worker";
		p.paperAbstract = "<p style='text-align: justify;'>Sometimes nonverbal cues get lost in translation in virtual team meetings which only allow audio or partially video. In other situations, your team is co-located but everyone is very focussed on their work – there is simply no time to pay attention to your feelings. We believe that emotions affect our work, how we work together and that we can learn from our moods as well as from the moods of our colleagues in order to improve our work performance. From theory we know that reflective learning is very relevant to achieve improvements in work performance and that emotions play a powerful role in that reflection process, as they are used to attend to feelings when recalling past situations. These feelings, positive as well as negative, could lead to a re-evaluation of past experiences and in the end to a change of behaviour. Motivated by these reasons we have created the MoodMap App, a web-based application which easily allows you to capture and track your own moods. You can express yourself by just clicking on a coloured bi-dimensional map. Features for adding context and private notes to your moods are implemented to reach a better contextualisation. Additionally, the app guides your mood tracking with different intelligent prompts, which make you aware of drastic individual mood changes or significant deviations between your mood to the team’s mood. Sophisticated visualisations on an individual as well as collaborative level are available to easily follow the mood development and to get feedback with automatically created mood reports within the app or via email. With these characteristics and features, the MoodMap App aims at supporting you to re-visit your own moods, re-evaluate the mood development of your colleagues captured during work related events, reflect and learn from them and finally improve your individual and team work.</p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8764";
		p.type = "Poster / Demo";
		p.authors = "Andreas Thalhammer, Ioannis Stavrakantonakis, Ioan Toma";
		p.title = "Diversity-Aware Clustering of SIOC Posts";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8765";
		p.type = "Poster / Demo";
		p.authors = "Bjørnar Tessem, Bjarte Johansen, Csaba Veres";
		p.title = "Mobile Location-Driven Associative Search in DBpedia with Tag Clouds";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8766";
		p.type = "Poster / Demo";
		p.authors = "Csaba Veres, Eivind Eidheim Elseth";
		p.title = "Schema.org for the Semantic Web with MaDaME";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8767";
		p.type = "Poster / Demo";
		p.authors = "Panos Alexopoulos, Boris Villazón-Terrazas, Jose Manuel Gomez-Perez";
		p.title = "Knowledge Tagger: Customizable Semantic Entity Resolution using Ontological Evidence";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8768";
		p.type = "Poster / Demo";
		p.authors = "Simon Hangl, Ioan Toma, Andreas Thalhammer";
		p.title = "Introducing a Diversity-Aware Drupal Extension";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8769";
		p.type = "Poster / Demo";
		p.authors = "Tanja Bergmann, Stefan Bunk, Johannes Eschrig, Christian Hentschel, Magnus Knuth, Harald Sack, Ricarda Schueler";
		p.title = "Linked Soccer Data";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8770";
		p.type = "Poster / Demo";
		p.authors = "Bettina Steger, Thomas Kurz";
		p.title = "Resource Description Graph Patterns for Configuring Linked Data Views";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8771";
		p.type = "Poster / Demo";
		p.authors = "Kalpa Gunaratna, Krishnaprasad Thirunarayan, Amit Sheth";
		p.title = "Types of Property Pairs and Alignment on Linked Datasets - A Preliminary Analysis";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8772";
		p.type = "Poster / Demo";
		p.authors = "Belgin Mutlu, Patrick Hoefler, Vedran Sabol, Gerwald Tschinkel, Michael Granitzer";
		p.title = "Automated Visualization Support for Linked Research Data";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8773";
		p.type = "Poster / Demo";
		p.authors = "Stefan Bischof, Axel Polleres, Simon Sperl";
		p.title = "City Data Pipeline: Making Open Data Useful for Cities";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8774";
		p.type = "Poster / Demo";
		p.authors = "Dominik Kowald, Sebastian Dennerlein, Dieter Theiler, Simon Walk, Christoph Trattner";
		p.title = "The Social Semantic Server - A Tool to Provide Services on Social Semantic Network Data";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8775";
		p.type = "Poster / Demo";
		p.authors = "Magali Jaillard Dancette, Stéphane Schicklin, Audrey Larue Triolet";
		p.title = "A Comprehensive Microbial Knowledge Base to Support the Development of In-Vitro Diagnostic Solutions in Infectious Diseases";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8776";
		p.type = "Poster / Demo";
		p.authors = "Andreas Thalhammer, Ioannis Stavrakantonakis, Ioan Toma";
		p.title = "Diversity-Aware Clustering of SIOC Posts";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8777";
		p.type = "Poster / Demo";
		p.authors = "Bjørnar Tessem, Bjarte Johansen, Csaba Veres";
		p.title = "Mobile Location-Driven Associative Search in DBpedia with Tag Clouds";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8778";
		p.type = "Poster / Demo";
		p.authors = "Csaba Veres, Eivind Eidheim Elseth";
		p.title = "Schema.org for the Semantic Web with MaDaME";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8779";
		p.type = "Poster / Demo";
		p.authors = "Panos Alexopoulos, Boris Villazón-Terrazas, Jose Manuel Gomez-Perez";
		p.title = "Knowledge Tagger: Customizable Semantic Entity Resolution using Ontological Evidence";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8780";
		p.type = "Poster / Demo";
		p.authors = "Simon Hangl, Ioan Toma, Andreas Thalhammer";
		p.title = "Introducing a Diversity-Aware Drupal Extension";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8781";
		p.type = "Poster / Demo";
		p.authors = "Tanja Bergmann, Stefan Bunk, Johannes Eschrig, Christian Hentschel, Magnus Knuth, Harald Sack, Ricarda Schueler";
		p.title = "Linked Soccer Data";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8782";
		p.type = "Poster / Demo";
		p.authors = "Bettina Steger, Thomas Kurz";
		p.title = "Resource Description Graph Patterns for Configuring Linked Data Views";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8783";
		p.type = "Poster / Demo";
		p.authors = "Kalpa Gunaratna, Krishnaprasad Thirunarayan, Amit Sheth";
		p.title = "Types of Property Pairs and Alignment on Linked Datasets - A Preliminary Analysis";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8784";
		p.type = "Poster / Demo";
		p.authors = "Belgin Mutlu, Patrick Hoefler, Vedran Sabol, Gerwald Tschinkel, Michael Granitzer";
		p.title = "Automated Visualization Support for Linked Research Data";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8785";
		p.type = "Poster / Demo";
		p.authors = "Stefan Bischof, Axel Polleres, Simon Sperl";
		p.title = "City Data Pipeline: Making Open Data Useful for Cities";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8786";
		p.type = "Poster / Demo";
		p.authors = "Dominik Kowald, Sebastian Dennerlein, Dieter Theiler, Simon Walk, Christoph Trattner";
		p.title = "The Social Semantic Server - A Tool to Provide Services on Social Semantic Network Data";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		p = new PaperContent();
		p.id = "8787";
		p.type = "Poster / Demo";
		p.authors = "Magali Jaillard Dancette, Stéphane Schicklin, Audrey Larue Triolet";
		p.title = "A Comprehensive Microbial Knowledge Base to Support the Development of In-Vitro Diagnostic Solutions in Infectious Diseases";
		p.paperAbstract = "<p style='text-align: justify;'></p>";
		p.contentlink = "null";
		pList.add(p);
        
		
		return pList;
	}
	
	
	
    
}
