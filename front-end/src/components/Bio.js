import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';

const styles = theme => ({
  root: {
    display: 'flex',
    maxWidth: '100vw',
  },
  image: {
    position: 'relative',
    height: '50vh',
	width: '100vw',
  },
  imageSrc: {
    position: 'absolute',
    left: 0,
    right: 0,
    top: 0,
    bottom: 0,
	backgroundImage: 'url("https://cdn.wallpapersafari.com/45/3/kFgL2i.jpg")',
    backgroundPosition: 'center 40%',
	backgroundRepeat: 'no-repeat',
	backgroundSize: 'cover',
  },
  imageBackdrop: {
    position: 'absolute',
    left: 0,
    right: 0,
    top: 0,
    bottom: 0,
    backgroundColor: theme.palette.common.black,
    opacity: 0.4,
  },
  bioTitle: {
    position: 'relative',
    padding: `${theme.spacing.unit * 2}px ${theme.spacing.unit * 4}px ${theme.spacing.unit + 6}px`,
	color: 'white',
	fontWeight: 'bold',
	fontSize:'xx-large',
	textAlign: 'center',
  },
  bioBody: {
    position: 'relative',
    padding: `${theme.spacing.unit * 2}px ${theme.spacing.unit * 4}px ${theme.spacing.unit + 6}px`,
	color: 'white',
	fontWeight: 'bold',
  },
});

const bio = {
	backgroundUrl: 'https://cdn.wallpapersafari.com/45/3/kFgL2i.jpg',
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
        <div className={classes.image}>
			<span className={classes.imageSrc}/>
			<span className={classes.imageBackdrop}/>
			<Typography component="span"color="inherit" className={classes.bioTitle}>
				{bio.title}
			</Typography>
			<Typography component="span"color="inherit" className={classes.bioBody}>
				{bio.body}
			</Typography>
        </div>
    </div>
  );
  
}

Bio.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(Bio);