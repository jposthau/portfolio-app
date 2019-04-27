import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';

const styles = theme => ({
  root: {
    width: '100%',
	height: 'calc(100vw*(414/958))',
  },
  imageSrc: {
    position: 'absolute',
    left: 0,
    right: 0,
    top: 0,
    bottom: 0,
	backgroundImage: 'url("https://cdn.wallpapersafari.com/45/3/kFgL2i.jpg")',
    backgroundPosition: 'center top',
	backgroundRepeat: 'no-repeat',
	backgroundSize: 'cover',
	width: '100%',
	height: 'auto',
  },
  imageBackdrop: {
    position: 'absolute',
    left: 0,
    right: 0,
    top: 0,
    bottom: 0,
    backgroundColor: theme.palette.common.black,
    opacity: 0.4,
	width: '100%',
	height: 'auto',
  },
  bioTitle: {
    position: 'relative',
    marginTop: 'calc(100vw*(.035))',
	color: 'white',
	fontWeight: 'bold',
	fontSize:'calc(100vw*(.035))',
	textAlign: 'center',
  },
  bioBody: {
    position: 'relative',
	color: 'white',
	fontWeight: 'bold',
	margin: 'auto calc(100vw*(.02)) calc(100vw*(.02)) calc(100vw*(.02))',
	fontSize:'calc(100vw*(.02))',
  },
  bio: {
	  display: 'flex',
	  flexDirection: 'column',
	  height: 'calc(100vw*(414/958))',
  },
});

const bio = {
	title: 'Hi! I\'m Jordan, a software developer from Chicago',
	body: 'I am passionate about solving problems with quality software. '
		  +'I specialize in backend development using Java, however I have '
		  +'begun exposing myself to front end technologies such as React. '
		  +'Please have a look around and see what I have accomplished using these technologies.',
};

function Bio(props) {
  const { classes } = props;
  
  return (
    <div className={classes.root}>
			<span className={classes.imageSrc}/>
			<span className={classes.imageBackdrop}/>
			<div className={classes.bio}>
				<div className={classes.bioTitle}>
					{bio.title}
				</div>
				<div className={classes.bioBody}>
					{bio.body}
				</div>
			</div>
    </div>
  );
  
}

Bio.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(Bio);